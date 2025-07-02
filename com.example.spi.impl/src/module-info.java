module com.example.spi.impl {
	requires com.example.spi;
	exports com.example.spi.impl;
	provides com.example.spi.PaymentService with com.example.spi.impl.CreditCardPayment;
}