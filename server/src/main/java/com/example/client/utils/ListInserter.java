package com.example.client.utils;

import com.example.client.model.Identified;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public abstract class ListInserter
{
    public interface Builder<T extends Identified>
    {
        T build(long i);
    }
    public static <T extends Identified, R extends CrudRepository<T, Long>, B extends Builder<T>> void insert(R repo, B builder, long n)
    {
        repo.saveAll(LongStream.range(1,n).mapToObj(builder::build).collect(Collectors.toList()));
    }
    public static <T extends Identified, R extends CrudRepository<T, Long>, B extends Builder<T>, I> void insertFromList(R repo, B builder, List<I> list)
    {
        insert(repo,builder,list.size()+1);
    }
}
