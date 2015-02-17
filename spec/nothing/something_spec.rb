require 'divide'
require 'sqrt'

#dummy test
describe "Something" do
  it "does nothing" do
    expect(divide(2, 2)).to eq(1)
  end
  
  it "implements Newton's method" do
    expect(sqrt(4)).to be_within(0.001).of(2)
  end
end
