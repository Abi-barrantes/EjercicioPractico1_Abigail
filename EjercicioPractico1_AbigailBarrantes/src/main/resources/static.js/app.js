// 💖 Salón Glamour - JS girly 💖

// Mensajito bonito al cargar la página
document.addEventListener("DOMContentLoaded", function () {
    console.log("✨ Bienvenida a Salón Glamour ✨");
});

// Confirmación antes de eliminar (categorías y servicios)
function confirmarEliminacion() {
    return confirm("💔 ¿Estás segura de que deseas eliminar este registro?");
}

// Animación suave al pasar el mouse por botones
const botones = document.querySelectorAll("button, .boton");

botones.forEach(boton => {
    boton.addEventListener("mouseover", () => {
        boton.style.transform = "scale(1.05)";
        boton.style.transition = "0.3s";
    });

    boton.addEventListener("mouseout", () => {
        boton.style.transform = "scale(1)";
    });
});

// Mensaje fake para formulario de contacto (solo interfaz)
function enviarMensaje() {
    alert("💌 Gracias por tu mensaje, pronto te contactaremos 💖");
    return false; // evita que se envíe
}