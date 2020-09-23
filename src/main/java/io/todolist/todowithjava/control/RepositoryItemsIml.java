package io.todolist.todowithjava.control;

import io.todolist.todowithjava.pojo.Listitem;
import io.todolist.todowithjava.repo.RepositoryItems;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class RepositoryItemsIml implements RepositoryItems {

    @Override
    public List<Listitem> findAll() {
        return null;
    }

    @Override
    public List<Listitem> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Listitem> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Listitem> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Listitem entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Listitem> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Listitem> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Listitem> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Listitem> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Listitem> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Listitem> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Listitem getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Listitem> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Listitem> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Listitem> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Listitem> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Listitem> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Listitem> boolean exists(Example<S> example) {
        return false;
    }
}
