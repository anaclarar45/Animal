class Animal:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def fazer_som(self):
        pass  # Método genérico para fazer som, que pode ser sobrescrito pelas subclasses

class Mamifero(Animal):
    def __init__(self, nome, idade, alimento):
        super().__init__(nome, idade)
        self.alimento = alimento

    def get_alimento(self):
        return self.alimento

    def set_alimento(self, alimento):
        self.alimento = alimento

class Peixe(Animal):
    def __init__(self, nome, idade, caracteristica):
        super().__init__(nome, idade)
        self.caracteristica = caracteristica

    def get_caracteristica(self):
        return self.caracteristica

    def set_caracteristica(self, caracteristica):
        self.caracteristica = caracteristica

    def toString(self):
        return f"Nome: {self.nome}, Idade: {self.idade}, Característica: {self.caracteristica}"

mamifero1 = Mamifero("cachorro", 17, "latido")
print(mamifero1.nome)
print(mamifero1.get_alimento())

peixe1 = Peixe("Peixe-palhaço", 12, "Listras coloridas vermelhas")
print(peixe1.nome)
print(peixe1.get_caracteristica())
print(peixe1.toString())
