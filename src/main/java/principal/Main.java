package principal;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;

import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      SellerDao sellerDao = DaoFactory.createSellerDao();
      System.out.println("======= Test 1: seller findById ========");
      Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("======= Test 2: seller findById ========");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller s : list){
            System.out.println(s);
        }

        System.out.println("======= Test 3: seller findById ========");
        list= sellerDao.findAll();
        for(Seller s : list){
            System.out.println(s);
        }

        System.out.println("======= Test 4: seller findById ========");
        Seller newSeller = new Seller(null,"Pedro", "pedro@gmail.com", new Date(), 2000.0, department);
        sellerDao.inserir(newSeller);
        System.out.println("Inserido! ID novo = " + newSeller.getId());
    }
}