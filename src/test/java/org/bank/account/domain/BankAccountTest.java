package org.bank.account.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class BankAccountTest {
    @Test
    public void initial_balance_is_zero() {
        var newBankAccount = new BankAccount();
        assertThat(newBankAccount.balance()).isEqualTo(0);
    }
}
