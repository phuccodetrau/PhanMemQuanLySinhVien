/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.service;

import com.mycompany.phanmemquanlysinhvien.model.SinhVien;
import java.util.List;

/**
 *
 * @author HOANGPHUC
 */
public interface ISort {
    public List<SinhVien> filter(List<SinhVien> list);
}
