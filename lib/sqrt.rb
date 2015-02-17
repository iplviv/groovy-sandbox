# approximate math function
#
def sqrt(x)
  z = 1
  while true
    zn = z - (z*z - x)/(2.0*z)
    break if (zn - z).abs < 0.0001
    z = zn
  end
  z
end
