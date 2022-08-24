package com.example.ecommerceappbackend.utils;

import com.example.ecommerceappbackend.model.Product;
import com.example.ecommerceappbackend.repository.CategoryRepository;
import com.example.ecommerceappbackend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Component
@Transactional
public class InitializerRunner implements CommandLineRunner {


    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {


       productRepository.deleteAll();


       Product product1 = new Product("Monster Abra A5 V18.1.1", 2200.0, "https://cdn.dsmcdn.com/ty343/product/media/images/20220228/15/59976124/191277609/1/1_org_thumb.jpg", "elektronik", "Monster Abra A5 V18.1.1");
       Product product2 = new Product("AVVA Erkek T-shirt", 119.0, "https://cdn.dsmcdn.com//ty453/product/media/images/20220613/9/124980413/66147235/1/1_org.jpg", "erkek", "Avva Erkek Beyaz Polo Yaka Düz T-shirt");
       Product product3 = new Product("Iphone 12", 1300.0, "https://cdn.dsmcdn.com/ty198/product/media/images/20211014/17/147832282/113336027/1/1_org_thumb.jpg", "elektronik","Apple iPhone 12 64GB Yeşil Cep Telefonu");
       Product product4 = new Product("Kız Çocuk Çilekli Elbise", 89.0, "https://cdn.dsmcdn.com/ty385/product/media/images/20220404/23/83148986/436840594/1/1_org_thumb.jpg", "cocuk", "Entel Tasarım  Kız Çocuk Çilek Elbise ");
       Product product5 = new Product("Minderli Şezlong Seti", 399.0, "https://cdn.dsmcdn.com/ty99/product/media/images/20210408/16/78743036/161957054/1/1_org_thumb.jpg", "ev%20ve%20yasam", " Minderli - Nora Şezlong Seti ");
       Product product6 = new Product("Yavru Köpek Maması", 220.0, "https://cdn.dsmcdn.com/ty331/product/media/images/20220214/10/49986274/158102304/1/1_org_thumb.jpg", "supermarket", "PERFECT Kuzu Etli Yetişkin Köpek Maması ");
       Product product7 = new Product("Mango Yüksek Bel Jean", 150.0, "https://cdn.dsmcdn.com/ty335/product/media/images/20220217/20/52082329/321435088/1/1_org_thumb.jpg", "kadin", "Mango Düz Kesimli Yüksek Bel Jean Pantolon");
       Product product8 = new Product("Üçlü Avize", 220.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty429/product/media/images/20220513/13/110426189/437438329/1/1_org_zoom.jpg", "ev ve yasam", "Antre Avize");
       Product product9 = new Product("Çocuk Şort", 330.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty458/product/media/images/20220621/14/128445522/441248479/3/3_org_zoom.jpg", "cocuk", "Haki Erkek Çocuk Dokuma Keten Şort");
       Product product10 = new Product("HyperX Cloud II", 200.0, "https://cdn.dsmcdn.com/ty432/product/media/images/20220516/13/112117585/13870166/2/2_org_thumb.jpg", "elektronik", "HyperX Cloud II Oyuncu Kulaklık");
       Product product11 = new Product("Oversize T-shirt", 50.0,"https://cdn.dsmcdn.com/ty400/product/media/images/20220416/15/92960861/450766723/1/1_org_thumb.jpg", "kadin", "Mongo Kadın Lila Oversize T-shirt");
       Product product12 = new Product("Playstation 5 ", 1700.0, "https://cdn.dsmcdn.com/ty32/product/media/images/20210326/23/75554837/108939192/1/1_org_thumb.jpg", "elektronik", "Sony Playstation 5 + 2. PS5 DualSense");
       Product product13 = new Product("Kadın Sweatshirt", 90.0, "https://cdn.dsmcdn.com/ty270/product/media/images/20211214/22/11117603/274322303/1/1_org_thumb.jpg", "kadin", "MOONBULL Kadın Siyah Kapüşonlu Sweatshirt");
       Product product14 = new Product("Kadın T-shirt", 80.0, "https://cdn.dsmcdn.com/ty447/product/media/images/20220607/15/122564243/406881016/1/1_org_thumb.jpg", "kadin", "Yingyang Baskılı Tshirt TSH-yingyang");
       Product product15 = new Product("Macbook Pro M1", 2000.0, "https://cdn.dsmcdn.com/ty208/product/media/images/20211025/14/155922944/124608528/1/1_org_thumb.jpg", "elektronik", "Apple Macbook Pro 13 M1 Ssd Uzay Grisi");
       Product product16 = new Product("Odyssey Monitör ", 2999.0, "https://cdn.dsmcdn.com/ty265/product/media/images/20211206/12/5488958/331013838/1/1_org_thumb.jpg","elektronik", "Samsung 27 Freesync VA Gamıng Monıtor");
       Product product17 = new Product("Unisex Güneş Gözlüğü ", 299.0, "https://cdn.dsmcdn.com/ty157/product/media/images/20210812/11/118001523/148670287/1/1_org_thumb.jpg", "aksesuar", "Mathilda Unisex Güneş Gözlüğü");
       Product product18 = new Product("Beyaz T-shirt", 199.0 ,"https://cdn.dsmcdn.com/ty395/product/media/images/20220413/0/89633830/162251546/1/1_org_zoom.jpg", "erkek", "Örme Oversize Beyaz T-shirt");
       Product product19 = new Product("Gap Çocuk T-shirt", 170.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty503/product/media/images/20220810/12/157427876/239769720/1/1_org_zoom.jpg", "cocuk", "GAP Erkek BebekKapüşonlu Sweatshirt");
       Product product20 = new Product("AVVA Erkek T-shirt", 119.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty434/product/media/images/20220518/4/112958623/481728584/1/1_org_zoom.jpg", "cocuk", "Kız Çocuk Şort Takım");
       Product product21 = new Product("Kadın elbise", 130.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty502/product/media/images/20220810/17/157580809/540795050/1/1_org_zoom.jpg", "kadin","V Yaka Dökümlü Salaş Maxi Saten Elbise ");
       Product product22 = new Product("Rexona Kadın Sprey", 140.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty507/product/media/images/20220815/15/160183215/58342769/1/1_org_zoom.jpg", "kozmetik", "Shower Fresh 200 ml X3 Adet");
       Product product23 = new Product("Hummal Çanta", 399.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty86/product/media/images/20210317/15/73072539/15837335/1/1_org_zoom.jpg", "spor ve outdoor", "HUMMEL Unisex Sırt Çantası - David Back Pack");
       Product product24 = new Product("Lacivert T-shirt", 120.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty138/product/media/images/20210630/14/105799921/150342417/1/1_org_zoom.jpg", "erkek", "Polo Yaka Cepli Regular Fit Bol Kesim Düz Tişört");
       Product product25 = new Product("Jacobs", 150.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty35/product/media/images/20201218/8/39547279/66906671/1/1_org_zoom.jpg", "supermarket", "Selection Filtre Kahve 250 gr 4 Al 3 Öde");
       Product product26 = new Product("Karışık Kuruyemiş", 130.0, "https://cdn.dsmcdn.com/mnresize/1200/1800/ty31/product/media/images/20201203/8/34646817/22254398/1/1_org_zoom.jpg", "supermarket", "Çakır Çerez Lüks Karışık Kuruyemiş 1 Kg");
       //Product product27 = new Product("", 270.0, "", "", "");
       //Product product28 = new Product("", 430.0 ,"", "", "");
       //Product product29 = new Product("", 199.0 ,"", "", "");
       //Product product30 = new Product("", 1700.0, "", "", "");
       //Product product31 = new Product("", 90.0, "", "", "");
       //Product product32 = new Product("", 80.0, "", "", "");
       //Product product33 = new Product("", 200.0, "", "", "");
       //Product product34 = new Product("", 189.0, "","", "");
       //Product product35 = new Product("", 269.0, "", "", "");
       //Product product36 = new Product("", 185.0 ,"", "", "");

       productRepository.save(product1);
       productRepository.save(product2);
       productRepository.save(product3);
       productRepository.save(product4);
       productRepository.save(product5);
       productRepository.save(product6);
       productRepository.save(product7);
       productRepository.save(product8);
       productRepository.save(product9);
       productRepository.save(product10);
       productRepository.save(product11);
       productRepository.save(product12);
       productRepository.save(product13);
       productRepository.save(product14);
       productRepository.save(product15);
       productRepository.save(product16);
       productRepository.save(product17);
       productRepository.save(product18);
       productRepository.save(product19);
       productRepository.save(product20);
       productRepository.save(product21);
       productRepository.save(product22);
       productRepository.save(product23);
       productRepository.save(product24);
       productRepository.save(product25);
       productRepository.save(product26);
       //productRepository.save(product27);
       //productRepository.save(product28);
       //productRepository.save(product29);
       //productRepository.save(product30);
       //productRepository.save(product31);
       //productRepository.save(product32);
       //productRepository.save(product33);
       //productRepository.save(product34);
       //productRepository.save(product35);
       //productRepository.save(product36);

        logger.info("All test data is saved");



    }
}