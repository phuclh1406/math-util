/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phucle.mathutil.main;

import com.phucle.mathutil.core.MathUtil;

/**
 *
 * @author predator
 */
public class Main {
    public static void main(String[] args) {
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính được k
        //       0 coi là mấy
        //       20 coi là mấy
        //       21 coi ra mấy
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
        //giả lập hành vi xài của ai đó!!
        
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG APP, XÀI APP (HÀM) ÀM NÓ BAO HÀM
        //INPUT : DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO
        //ĐỂ XỬ LÍ
        //KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY K
        
        long expected = 120; //kì vọng hàm trả về 120 nếu tính 5!
        int n = 5;           //input
        long actual = MathUtil.getFactorial(5);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
