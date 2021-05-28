package com.example.test2asm.controller;

import com.example.test2asm.entity.SaleInvoiceDetail;
import com.example.test2asm.service.SaleInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SaleInvoiceController {

    @Autowired
    private SaleInvoiceService service;

    @PostMapping("/addInvoice")
    public SaleInvoiceDetail addInvoice(@RequestBody SaleInvoiceDetail saleInvoiceDetail) {
        return service.saveInvoice(saleInvoiceDetail);
    }

    @PostMapping("/addInvoices")
    public List<SaleInvoiceDetail> addInvoices(@RequestBody List<SaleInvoiceDetail> saleInvoiceDetails) {
        return service.saveInvoices(saleInvoiceDetails);
    }

    @GetMapping("/invoices")
    public List<SaleInvoiceDetail> findAllInvoices() {
        return service.getInvoices();
    }

    @GetMapping("/invoiceById/{id}")
    public SaleInvoiceDetail findInvoiceById(@PathVariable int id) {
        return service.getInvoiceById(id);
    }

    @PutMapping("/updateInvoice")
    public SaleInvoiceDetail updateInvoice(@RequestBody SaleInvoiceDetail saleInvoiceDetail) {
        return service.updateInvoice(saleInvoiceDetail);
    }

    @DeleteMapping("/deleteInvoice/{id}")
    public String deleteInvoice(@PathVariable int id) {
        return service.deleteInvoice(id);
    }
}
