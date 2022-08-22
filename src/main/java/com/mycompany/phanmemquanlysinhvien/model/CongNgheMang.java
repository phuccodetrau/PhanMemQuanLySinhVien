/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class CongNgheMang extends MonHoc{
    public CongNgheMang() {
        super.soTinChi = 3;
        super.tenMonHoc = "Cong Nghe Mang May Tinh";
    }

    public CongNgheMang(String lopHocPhan, double diem) {
        super(lopHocPhan, diem);
        super.soTinChi = 3;
        super.tenMonHoc = "Cong Nghe Mang May Tinh";
    }
    
    
}
