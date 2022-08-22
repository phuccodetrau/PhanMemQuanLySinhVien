/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class LapTrinhCanBan extends MonHoc{
    public LapTrinhCanBan() {
        super.soTinChi = 3;
        super.tenMonHoc = "Lap Trinh Can Ban";
    }

    public LapTrinhCanBan(String lopHocPhan, double diem) {
        super(lopHocPhan, diem);
        super.soTinChi = 2;
        super.tenMonHoc = "Lap Trinh Can Ban";
    }
}
