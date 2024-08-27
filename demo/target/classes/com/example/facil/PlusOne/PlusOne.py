class PlusOne:
    def plusOne(self, digits: list[int]) -> list[int]:
        tamanho = len(digits) - 1
        for index in range(tamanho, -1, -1):
            if digits[index] < 9:
                digits[index] += 1
                return digits
            digits[index] = 0
        
        new_digits = [0] * (len(digits) + 1)
        new_digits[0] = 1
        return new_digits
plusOne = PlusOne()

# Teste 1: [1, 2, 3] deve resultar em [1, 2, 4]
digits = [1, 2, 3]
print("Input:", digits)
result = plusOne.plusOne(digits)
print("Output:", result)  # Esperado: [1, 2, 4]

# Teste 2: [9, 9, 9] deve resultar em [1, 0, 0, 0]
digits = [9, 9, 9]
print("Input:", digits)
result = plusOne.plusOne(digits)
print("Output:", result)  # Esperado: [1, 0, 0, 0]