/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class TinHocDaiCuong extends MonHoc{
    public TinHocDaiCuong() {
        super.soTinChi = 2;
        super.tenMonHoc = "Tin Hoc Dai Cuong";
    }   

    public TinHocDaiCuong(String lopHocPhan, double diem) {
        super(lopHocPhan, diem);
        super.soTinChi = 2;
        super.tenMonHoc = "Tin Hoc Dai Cuong";
    }
}
