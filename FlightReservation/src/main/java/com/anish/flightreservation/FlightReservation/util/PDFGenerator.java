package com.anish.flightreservation.FlightReservation.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.anish.flightreservation.FlightReservation.entities.Reservation;
import com.anish.flightreservation.FlightReservation.service.ReservationServiceImpl;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Component
public class PDFGenerator {
	
	private  static final Logger LOGGER = LoggerFactory.getLogger(PDFGenerator.class);

	
	
	public void generateTicket(Reservation reservation,String filePath)
	{
		Document doc = new Document();
		LOGGER.info("Inside generateTicket method "+ reservation);
		try {
			PdfWriter.getInstance(doc,new FileOutputStream(filePath));
			doc.open();
			doc.add(generateTable(reservation));
			doc.close();
			
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Inside generateTicket method "+ e);
		}
	}

	private PdfPTable generateTable(Reservation reservation) {
		
		LOGGER.info("Inside generateTable method "+ reservation);
		
		PdfPCell cell;
		PdfPTable table = new PdfPTable(2); 
		cell= new PdfPCell(new Phrase("Flight Reservation Details"));
		cell.setColspan(2);
		table.addCell( cell);
		
		cell= new PdfPCell(new Phrase("Flight Details"));
		cell.setColspan(2);
		table.addCell( cell);
		table.addCell("Operating Airlines");
		table.addCell(reservation.getFlight().getOperating_airlines());
		table.addCell("Departure City");
		table.addCell(reservation.getFlight().getDeparture_city());
		table.addCell("Arrival City");
		table.addCell(reservation.getFlight().getArrival_city());
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlight_no());
		table.addCell("Departure Date");
		table.addCell(reservation.getFlight().getDeparture_date());
		
		cell= new PdfPCell(new Phrase("Passenger Details"));
		cell.setColspan(2);
		table.addCell( cell);
		
		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getF_name());
		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getL_name());
		table.addCell("Phone");
		table.addCell(reservation.getPassenger().getPhone());
		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());
		
		return table;
	}

}
