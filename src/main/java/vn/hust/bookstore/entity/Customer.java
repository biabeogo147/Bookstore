package vn.hust.bookstore.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import vn.hust.bookstore.entity.Order;

import java.util.List;

@Entity
@Getter
@Setter
public class Customer extends Account {
    private String address;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> purchaseHistory;
}
