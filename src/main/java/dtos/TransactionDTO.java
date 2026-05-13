package dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import enums.TransactionStatus;
import enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {

	private Long id;

	private Integer totalProducts;

	private BigDecimal totalPrice;

	private TransactionType transactionType; // pruchase, sale, return

	private TransactionStatus status; // pending, completed, processing

	private String description;
	private String note;

	private LocalDateTime createdAt;
	private LocalDateTime updateAt;

	private ProductDTO product;

	private UserDTO user;

	private SupplierDTO supplier;
}
