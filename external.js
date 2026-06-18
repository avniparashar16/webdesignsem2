function calculateSum() {
    let n = parseInt(document.getElementById("num").value);

    if (isNaN(n) || n < 1) {
        document.getElementById("result").textContent =
            "Please enter a valid positive number.";
        return;
    }

    let sum = 0;

    for (let i = 1; i <= n; i++) {
        sum += i;
    }

    document.getElementById("result").textContent =
        "Sum of numbers from 1 to " + n + " = " + sum;
}