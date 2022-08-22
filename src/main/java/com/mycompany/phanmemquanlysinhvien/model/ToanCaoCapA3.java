/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class ToanCaoCapA3 extends MonHoc{
    public ToanCaoCapA3() {
        super.soTinChi = 3;
        super.tenMonHoc = "Toan Cao Cap A3";
    }   

    public ToanCaoCapA3(String lopHocPhan, double diem) {
        super(lopHocPhan, diem);
        super.soTinChi = 3;
        super.tenMonHoc = "Toan Cao Cap A3";
    }
}
