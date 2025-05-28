package com.onlineexam.analytics.service;

import com.onlineexam.analytics.model.Report;
import com.onlineexam.analytics.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public Report saveReport(Report report) {
        return reportRepository.save(report);
    }

    public List<Report> getReportsByExamId(Long examId) {
        return reportRepository.findByExamId(examId);
    }

    public List<Report> getReportsByUserId(Long userId) {
        return reportRepository.findByUserId(userId);
    }

    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }
}
