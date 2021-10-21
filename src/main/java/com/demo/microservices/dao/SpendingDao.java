package com.demo.microservices.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.microservices.model.SpendingVO;

@Mapper
public interface SpendingDao {
	
	List<SpendingVO> selectSpendingPaymentAll(int userId); //나의 결제내역 전체 조회 pay_info

	SpendingVO selectSpendingPayment(int payId); //나의 결제내역 중 한개 상세조회 pay_info

	int insertSpendingPayment(SpendingVO spending); //결제내역 등록

	int updateSpendingPayment(SpendingVO spending); //결제내역 수정

	int deleteSpendingPayment(int payId); //결제내역 삭제

	
	
	List<SpendingVO> selectSpendingTravelAll(int trvlId); //여행별 결제내역 조회 trvl_pay_info

	SpendingVO selectSpendingTravel(int trvlPayId); //여행별 결제내역 조회 trvl_pay_info
	
	int insertSpendingTravel(SpendingVO spending); //여행별 결제내역 등록
	
	int updateSpendingTravel(SpendingVO spending); //여행별 결제내역 수정
	
	int deleteSpendingTravel(int trvlPayId); //여행별 결제내역 삭제

	
	
	int updateSpendingTravelRate(int trvlId); //여행비 사용 금액 비율 갱신하기
	
	int getTrvlIdWithTrvlPayId(int trvlPayId); //여행결제내역 id로 여행 id 가져오기

}