package controllers

import play.api.mvc._
import util.pdf.PDF

object Application extends Controller {
  
  def index = Action {
    val pdf: Array[Byte] = PDF.toBytes(views.html.index("Hello world"))
    Ok(pdf).as("application/pdf")
  }
  
}