/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class TheChat extends MonHoc{
    public TheChat() {
        super.soTinChi = 1;
        super.tenMonHoc = "The Chat";
    }

    public TheChat(String lopHocPhan, double diem) {
        super(lopHocPhan, diem);
        super.soTinChi = 1;
        super.tenMonHoc = "The Chat";
    }
}
