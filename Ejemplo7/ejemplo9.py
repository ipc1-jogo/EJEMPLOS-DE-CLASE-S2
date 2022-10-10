from flask import Flask, jsonify, request

app = Flask(__name__)

estudiantes = []

@app.route('/')
def home():
    diccionario = {
        "mensaje": "Hola mundo!",
        "status": 200
    }

    return jsonify(
        diccionario
    )

@app.route('/student', methods=['POST'])
def crear_estudiante():
    estudiante = request.get_json()
    estudiantes.append(estudiante)

    diccionario_respuesta =  {
        "mensaje": "Estudiante añadido exitosamente",
        "status": 200
    }
    return jsonify(diccionario_respuesta)

@app.route('/students', methods=['GET'])
def obtener_estudiantes():        
    return jsonify(estudiantes)

@app.route('/students', methods=['POST'])
def cargar_estudiantes():
    lista_estudiantes = request.get_json()
    for estudiante in lista_estudiantes:
        estudiantes.append(estudiante)

    diccionario_respuesta =  {
        "mensaje": "Estudiantes añadidos exitosamente",
        "status": 200
    }
    return jsonify(diccionario_respuesta)

@app.route('/students/<int:id>', methods=['PUT'])
def actualizar_estudiante(id): 
    body_estudiante = request.get_json()
    for estudiante in estudiantes:
        if estudiante["id"] == id:
            estudiante["nombre"] = body_estudiante.get("nombre")
            estudiante["apellido"] = body_estudiante.get("apellido")
            estudiante["nota"] = body_estudiante.get("nota")
            print(estudiante)

            return jsonify({
                "mensaje": "Estudiante actualizado exitosamente",
                "status": 200
            })
    

    return jsonify({
        "mensaje": "Estudiante no actualizado",
        "status": 404
    })

@app.route('/students/<int:id>', methods=['DELETE'])
def eliminar_estudiante(id):        
    for i in range(len(estudiantes)):
        estudiante = estudiantes[i]
        if estudiante["id"] == id:
            estudiantes.pop(i)  #|2:Alan|
            return jsonify({
                "mensaje": "Estudiante eliminado exitosamente",
                "status": 200
            }) 

    return jsonify({
        "mensaje": "Estudiante no encontrado",
        "status": 404
    })   

@app.route('/students/find', methods=['GET'])
def buscar_estudiante():
    nombre = request.args.get("nombre") 
    nota = float(request.args.get("nota"))        
    
    for estudiante in estudiantes:
        if estudiante.get("nombre") == nombre and estudiante.get("nota") == nota:
            return jsonify(estudiante) 
    return jsonify({
        "mensaje": "No se encontro el estudiante",
        "status": 404
    }) 
    

if __name__ == '__main__':
    app.run(port=3004, debug=True)
