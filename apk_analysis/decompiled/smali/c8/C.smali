.class public final Lc8/C;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public final synthetic d:Lc8/z;


# direct methods
.method public constructor <init>(Lc8/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc8/C;->d:Lc8/z;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, LE7/g;

    .line 8
    .line 9
    invoke-interface {p2}, LE7/g;->getKey()LE7/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lc8/C;->d:Lc8/z;

    .line 14
    .line 15
    iget-object v1, v1, Lc8/z;->s:LE7/i;

    .line 16
    .line 17
    invoke-interface {v1, v0}, LE7/i;->get(LE7/h;)LE7/g;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, LY7/g0;->a:LY7/g0;

    .line 22
    .line 23
    if-eq v0, v2, :cond_1

    .line 24
    .line 25
    if-eq p2, v1, :cond_0

    .line 26
    .line 27
    const/high16 p1, -0x80000000

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    check-cast v1, LY7/h0;

    .line 38
    .line 39
    check-cast p2, LY7/h0;

    .line 40
    .line 41
    :goto_1
    if-nez p2, :cond_2

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    if-ne p2, v1, :cond_3

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    instance-of v0, p2, Ld8/t;

    .line 49
    .line 50
    if-nez v0, :cond_6

    .line 51
    .line 52
    :goto_2
    if-ne p2, v1, :cond_5

    .line 53
    .line 54
    if-nez v1, :cond_4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v2, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 69
    .line 70
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p2, ", expected child of "

    .line 77
    .line 78
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p2, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 85
    .line 86
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_6
    invoke-interface {p2}, LY7/h0;->getParent()LY7/h0;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    goto :goto_1
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method
