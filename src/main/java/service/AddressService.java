package service;

import bl.Util;
import dao.AddressDAO;
import entity.Address;

import java.sql.Connection;
import java.util.List;

public class AddressService extends Util implements AddressDAO {

    Connection connection=getConnection();

    @Override
    public void add(Address address) {

    }

    @Override
    public List<Address> getAll() {
        return null;
    }

    @Override
    public Address getById(Long id) {
        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(Address address) {

    }
}
