package principal;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      SellerDao sellerDao = DaoFactory.createSellerDao();
      System.out.println("======= Test 1: seller findById ========");
      Seller seller = sellerDao.findById(3);

        System.out.println(seller);


    }
}