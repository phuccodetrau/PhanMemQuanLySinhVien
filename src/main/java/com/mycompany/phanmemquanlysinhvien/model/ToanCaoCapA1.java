/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class ToanCaoCapA1 extends MonHoc{
    public ToanCaoCapA1() {
        super.soTinChi = 4;
        super.tenMonHoc = "Toan Cao Cap A1";
    }   

    public ToanCaoCapA1(String lopHocPhan, double diem) {
        super(lopHocPhan, diem);
        super.soTinChi = 4;
        super.tenMonHoc = "Toan Cao Cap A1";
    }
}
