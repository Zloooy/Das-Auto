package com.example.client.component;

import com.example.client.model.*;
import com.example.client.repository.*;
import com.example.client.utils.ListInserter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Component
public class DataInitializer implements ApplicationRunner {

    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderStatusRepository orderStatusRepository;
    @Autowired
    private PaymentTypeRepository paymentTypeRepository;
    @Autowired
    private PartStatusRepository partStatusRepository;
    @Autowired
    private MechanicSpecializationRepository mechanicSpecializationRepository;
    @Autowired
    private CarMarkRepository carMarkRepository;


    private static final List<String> userRoles = Arrays.asList("Администратор");
    private static final List<String> orderStatuses = Arrays.asList("Завершен", "В процессе", "Отменён");
    private static final List<String> partStatuses = Arrays.asList("В пути", "На складе", "Списана");
    private static final List<String> paymentTypes = Arrays.asList("Наличными","Картой");
    private static final List<String> mechanicSpecializations = Arrays.asList("Маляр","Фрезеровщик","Сварщик");
    private static final List<String> carMarks = Arrays.asList("Mercedes","BMW","Lada");
    @Override
    public void run(ApplicationArguments args) throws Exception {
        createRoles();
        createAdmin();
        createOrderStatuses();
        createPartStatuses();
        createPaymentTypes();
        createMechanicSpecializations();
        createCarMarks();
    }
    private void createRoles()
    {
        AtomicLong i = new AtomicLong(1);
        userRoleRepository.saveAll(userRoles.stream().map((roleName)->new UserRole(i.getAndIncrement(),roleName)).collect(Collectors.toList()));
    }
    private void createAdmin()
    {
        userRepository.save(new User(1, "admin","1234", userRoleRepository.findById(1L).orElse(null)));
    }
    private void createOrderStatuses()
    {
        ListInserter.insertFromList(orderStatusRepository, i -> new OrderStatus(i, orderStatuses.get((int)i-1)),orderStatuses);
    }
    private void createPartStatuses()
    {
        ListInserter.insertFromList(partStatusRepository, i -> new PartStatus(i, partStatuses.get((int)i-1)), partStatuses);
    }
    private void createMechanicSpecializations()
    {
        ListInserter.insertFromList(mechanicSpecializationRepository, i -> new MechanicSpecialization(i, mechanicSpecializations.get((int) i-1)),mechanicSpecializations);
    }
    private void createPaymentTypes()
    {
        ListInserter.insertFromList(paymentTypeRepository, i -> new PaymentType(i, paymentTypes.get((int)i-1)), paymentTypes);
    }
    private void createCarMarks()
    {
        ListInserter.insertFromList(carMarkRepository, i -> new CarMark(i,carMarks.get((int)i-1)),carMarks);
    }

}
