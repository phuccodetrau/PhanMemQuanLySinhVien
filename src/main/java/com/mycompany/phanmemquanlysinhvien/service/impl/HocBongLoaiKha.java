/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.service.impl;

import com.mycompany.phanmemquanlysinhvien.model.SinhVien;
import com.mycompany.phanmemquanlysinhvien.service.ISort;
import com.mycompany.phanmemquanlysinhvien.util.CompareDiem;
import com.mycompany.phanmemquanlysinhvien.util.CompareMaSV;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOANGPHUC
 */
public class HocBongLoaiKha implements ISort
{

    @Override
    public List<SinhVien> filter(List<SinhVien> list) {
        list.sort(new CompareDiem().thenComparing(new CompareMaSV()));
        return list;
    }
}
