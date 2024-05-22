function validateName(name) {
    return /^[A-Za-z\s]+$/.test(name);
}

function validateEmail(email) {
    return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
}

function validateContact(contact) {
    return /^[7-9]\d{9}$/.test(contact);
}

function addCustomer() {
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const contact = document.getElementById('contact').value;
    const accountType = document.getElementById('accountType').value;

    let isValid = true;

    // Clear previous error messages
    document.getElementById('nameError').innerText = '';
    document.getElementById('emailError').innerText = '';
    document.getElementById('contactError').innerText = '';
    document.getElementById('accountTypeError').innerText = '';

    // Validate fields
    if (!validateName(name)) {
        document.getElementById('nameError').innerText = 'Please enter only alphabets';
        isValid = false;
    }
    if (!validateEmail(email)) {
        document.getElementById('emailError').innerText = 'Please enter a valid email address';
        isValid = false;
    }
    if (!validateContact(contact)) {
        document.getElementById('contactError').innerText = 'Please enter a valid 10-digit contact number starting with 7-9';
        isValid = false;
    }
    if (!accountType) {
        document.getElementById('accountTypeError').innerText = 'Please select an account type';
        isValid = false;
    }

    // If all fields are valid, add the customer to the table
    if (isValid) {
        const tableBody = document.getElementById('customerTableBody');
        const newRow = tableBody.insertRow();

        const nameCell = newRow.insertCell(0);
        const emailCell = newRow.insertCell(1);
        const contactCell = newRow.insertCell(2);
        const accountTypeCell = newRow.insertCell(3);

        nameCell.innerText = name;
        emailCell.innerText = email;
        contactCell.innerText = contact;
        accountTypeCell.innerText = accountType;

        // Clear the form>
        document.getElementById('customerForm').reset();
    }
}