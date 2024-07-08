package com.berkerdgn.lesson1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
//RequestMapping yüzünden artık localhost:8080/api/hello yazmamız gerek
public class HelloController {

    //localhost:8080/hello

    //GET : Veri görüntülemek istediğimiz zaman kullanıyoruz.                   @GetMapping
    //POST : Veri Kaydetmek istediğimiz zaman kullanıyoruz                      @PostMapping
    //Put : Veri güncellmek için kullanıyoruz                                   @PutMapping
    //Patch : Verinin bir bölümünü güncellemek istediğimz zaman kullanıyoruz.   @PatchMapping
    //      Örn: Parola güncellemek gibi.
    // Delete : Veri silmek istediğimz zaman kullanıyoruz                       @DeleteMapping


    //@RequestMapping(path = "/hello",method = RequestMethod.GET)
    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello World!";
    }


    @PostMapping("/save")
    public String save(){
        return "Data saved!";
    }


    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted!";
    }




}
