require 'yaml'


class HarvestEngine
    def load(input)
        IO.read(input).downcase
    end
end


class ProbabilityTable
    attr_header :frequencies
    
