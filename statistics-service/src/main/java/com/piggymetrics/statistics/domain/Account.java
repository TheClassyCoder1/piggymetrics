package com.piggymetrics.statistics.domain;

import java.math.BigDecimal;
import javax.validation.constraints.DecimalMin;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Document(collection = "accounts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	@Valid
	@NotNull
	private List<Item> incomes;

	@Valid
	@NotNull
	private List<Item> expenses;

	@Valid
	@NotNull
	private Saving saving;

	@NotNull
	@DecimalMin("0")
	private BigDecimal monthlySavingsGoal;

	public List<Item> getIncomes() {
		return incomes;
	}

	public void setIncomes(List<Item> incomes) {
		this.incomes = incomes;
	}

	public List<Item> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Item> expenses) {
		this.expenses = expenses;
	}

	public Saving getSaving() {
		return saving;
	}

	public void setSaving(Saving saving) {
		this.saving = saving;
	}

	public BigDecimal getMonthlySavingsGoal() {
		return monthlySavingsGoal;
	}

	public void setMonthlySavingsGoal(BigDecimal monthlySavingsGoal) {
		this.monthlySavingsGoal = monthlySavingsGoal;
	}
}
