/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanmemquanlysinhvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class SinhVienDTVT extends SinhVien{
    public SinhVienDTVT() {
        this.list[0] = new CongNgheMang();
        this.list[1] = new KyNangMem();
        this.list[2] = new LapTrinhCanBan();
        this.list[3] = new TheChat();
        this.list[4] = new TinHocDaiCuong();
        this.list[5] = new ToanCaoCapA1();
        this.list[6] = new ToanCaoCapA2();
        this.list[7] = new ToanCaoCapA3();
        this.list[8] = new TrietHoc();
        this.list[9] = new VatLyDaiCuong();
    }

    public SinhVienDTVT(String queQuan, String hoTen, String maSinhVien, String lop, int ngaySinh, int thangSinh, int namSinh) {
        super(queQuan, hoTen, maSinhVien, lop, ngaySinh, thangSinh, namSinh);
        this.list[0] = new CongNgheMang();
        this.list[1] = new KyNangMem();
        this.list[2] = new LapTrinhCanBan();
        this.list[3] = new TheChat();
        this.list[4] = new TinHocDaiCuong();
        this.list[5] = new ToanCaoCapA1();
        this.list[6] = new ToanCaoCapA2();
        this.list[7] = new ToanCaoCapA3();
        this.list[8] = new TrietHoc();
        this.list[9] = new VatLyDaiCuong();
    }
}
