function plusOne(digits: number[]): number[] {
    const lastIndex = digits.length - 1;
    
    for (let index = lastIndex; index >= 0; index--) {
        if (digits[index] < 9) {
            digits[index]++;
            return digits;
        }
        digits[index] = 0;
    }
    
    const newDigits: number[] = new Array(digits.length + 1).fill(0);
    newDigits[0] = 1;
    return newDigits;
}
 
const result = plusOne([9, 9, 9]);
console.log(result); 