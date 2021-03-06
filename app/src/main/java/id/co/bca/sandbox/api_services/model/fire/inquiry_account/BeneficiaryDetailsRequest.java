package id.co.bca.sandbox.api_services.model.fire.inquiry_account;

/**
 * BCA API Sandbox
 *
 * @author ctechdev18@gmail.com
 * @version 1.0
 */
public class BeneficiaryDetailsRequest {
    private String bankCodeType;
    private String bankCodeValue;
    private String accountNumber;

    public BeneficiaryDetailsRequest(String bankCodeType, String bankCodeValue, String accountNumber) {
        this.bankCodeType = bankCodeType;
        this.bankCodeValue = bankCodeValue;
        this.accountNumber = accountNumber;
    }

    public String getBankCodeType() {
        return bankCodeType;
    }

    public void setBankCodeType(String bankCodeType) {
        this.bankCodeType = bankCodeType;
    }

    public String getBankCodeValue() {
        return bankCodeValue;
    }

    public void setBankCodeValue(String bankCodeValue) {
        this.bankCodeValue = bankCodeValue;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
