package com.main.proteintrackertest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.proteintracker.TrackingService;

public class TrackingServiceTest {

	TrackingService service;

	@Before
	public void setup() {
		service = new TrackingService();
	}

	@Test
	public void NewTrackingServiceTotalIsZer() {
		assertEquals(0, service.getTotal());
	}

	@Test
	public void WhenAddingProteinTotalIncreasesByThatAmount() {
		service.addProtein(10);
		assertEquals(10, service.getTotal());
	}

	@Test
	public void WhenRemovingProteinTotalRemainsZero() {
		service.removeProtein(5);
		assertEquals(0, service.getTotal());
	}

}
