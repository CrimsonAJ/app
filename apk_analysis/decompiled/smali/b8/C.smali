.class public final Lb8/C;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/q;


# instance fields
.field public final synthetic r:I

.field public s:I

.field public synthetic t:Lb8/f;

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:LG7/j;


# direct methods
.method public constructor <init>(LE7/d;LO7/r;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb8/C;->r:I

    .line 1
    check-cast p2, LG7/j;

    iput-object p2, p0, Lb8/C;->v:LG7/j;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, LG7/j;-><init>(ILE7/d;)V

    return-void
.end method

.method public constructor <init>(LO7/p;LE7/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lb8/C;->r:I

    .line 2
    check-cast p1, LG7/j;

    iput-object p1, p0, Lb8/C;->v:LG7/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    return-void
.end method

.method public constructor <init>(LO7/q;LE7/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb8/C;->r:I

    .line 3
    check-cast p1, LG7/j;

    iput-object p1, p0, Lb8/C;->v:LG7/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lb8/C;->r:I

    .line 2
    .line 3
    check-cast p1, Lb8/f;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p3, LE7/d;

    .line 9
    .line 10
    new-instance v0, Lb8/C;

    .line 11
    .line 12
    iget-object v1, p0, Lb8/C;->v:LG7/j;

    .line 13
    .line 14
    invoke-direct {v0, v1, p3}, Lb8/C;-><init>(LO7/p;LE7/d;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lb8/C;->t:Lb8/f;

    .line 18
    .line 19
    iput-object p2, v0, Lb8/C;->u:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object p1, LA7/n;->a:LA7/n;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lb8/C;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p2, [Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p3, LE7/d;

    .line 31
    .line 32
    new-instance v0, Lb8/C;

    .line 33
    .line 34
    iget-object v1, p0, Lb8/C;->v:LG7/j;

    .line 35
    .line 36
    invoke-direct {v0, v1, p3}, Lb8/C;-><init>(LO7/q;LE7/d;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v0, Lb8/C;->t:Lb8/f;

    .line 40
    .line 41
    iput-object p2, v0, Lb8/C;->u:Ljava/lang/Object;

    .line 42
    .line 43
    sget-object p1, LA7/n;->a:LA7/n;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lb8/C;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :pswitch_1
    check-cast p2, [Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p3, LE7/d;

    .line 53
    .line 54
    new-instance v0, Lb8/C;

    .line 55
    .line 56
    iget-object v1, p0, Lb8/C;->v:LG7/j;

    .line 57
    .line 58
    invoke-direct {v0, p3, v1}, Lb8/C;-><init>(LE7/d;LO7/r;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, v0, Lb8/C;->t:Lb8/f;

    .line 62
    .line 63
    iput-object p2, v0, Lb8/C;->u:Ljava/lang/Object;

    .line 64
    .line 65
    sget-object p1, LA7/n;->a:LA7/n;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Lb8/C;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lb8/C;->r:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, LF7/a;->a:LF7/a;

    .line 7
    .line 8
    iget v1, p0, Lb8/C;->s:I

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    iget-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 31
    .line 32
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 40
    .line 41
    iget-object p1, p0, Lb8/C;->u:Ljava/lang/Object;

    .line 42
    .line 43
    iput-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 44
    .line 45
    iput v3, p0, Lb8/C;->s:I

    .line 46
    .line 47
    iget-object v3, p0, Lb8/C;->v:LG7/j;

    .line 48
    .line 49
    invoke-interface {v3, p1, p0}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    :goto_0
    const/4 v3, 0x0

    .line 57
    iput-object v3, p0, Lb8/C;->t:Lb8/f;

    .line 58
    .line 59
    iput v2, p0, Lb8/C;->s:I

    .line 60
    .line 61
    invoke-interface {v1, p1, p0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    :goto_1
    sget-object v0, LA7/n;->a:LA7/n;

    .line 69
    .line 70
    :goto_2
    return-object v0

    .line 71
    :pswitch_0
    sget-object v0, LF7/a;->a:LF7/a;

    .line 72
    .line 73
    iget v1, p0, Lb8/C;->s:I

    .line 74
    .line 75
    const/4 v2, 0x2

    .line 76
    const/4 v3, 0x1

    .line 77
    if-eqz v1, :cond_7

    .line 78
    .line 79
    if-eq v1, v3, :cond_6

    .line 80
    .line 81
    if-ne v1, v2, :cond_5

    .line 82
    .line 83
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_6
    iget-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 96
    .line 97
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_7
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 105
    .line 106
    iget-object p1, p0, Lb8/C;->u:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, [Ljava/lang/Object;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    aget-object v4, p1, v4

    .line 112
    .line 113
    aget-object p1, p1, v3

    .line 114
    .line 115
    iput-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 116
    .line 117
    iput v3, p0, Lb8/C;->s:I

    .line 118
    .line 119
    iget-object v3, p0, Lb8/C;->v:LG7/j;

    .line 120
    .line 121
    invoke-interface {v3, v4, p1, p0}, LO7/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v0, :cond_8

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    :goto_3
    const/4 v3, 0x0

    .line 129
    iput-object v3, p0, Lb8/C;->t:Lb8/f;

    .line 130
    .line 131
    iput v2, p0, Lb8/C;->s:I

    .line 132
    .line 133
    invoke-interface {v1, p1, p0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v0, :cond_9

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_9
    :goto_4
    sget-object v0, LA7/n;->a:LA7/n;

    .line 141
    .line 142
    :goto_5
    return-object v0

    .line 143
    :pswitch_1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 144
    .line 145
    iget v1, p0, Lb8/C;->s:I

    .line 146
    .line 147
    const/4 v2, 0x2

    .line 148
    const/4 v3, 0x1

    .line 149
    if-eqz v1, :cond_c

    .line 150
    .line 151
    if-eq v1, v3, :cond_b

    .line 152
    .line 153
    if-ne v1, v2, :cond_a

    .line 154
    .line 155
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 162
    .line 163
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_b
    iget-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 168
    .line 169
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_c
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 177
    .line 178
    iget-object p1, p0, Lb8/C;->u:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, [Ljava/lang/Object;

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    aget-object v4, p1, v4

    .line 184
    .line 185
    aget-object v5, p1, v3

    .line 186
    .line 187
    aget-object p1, p1, v2

    .line 188
    .line 189
    iput-object v1, p0, Lb8/C;->t:Lb8/f;

    .line 190
    .line 191
    iput v3, p0, Lb8/C;->s:I

    .line 192
    .line 193
    iget-object v3, p0, Lb8/C;->v:LG7/j;

    .line 194
    .line 195
    invoke-interface {v3, v4, v5, p1, p0}, LO7/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    if-ne p1, v0, :cond_d

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_d
    :goto_6
    const/4 v3, 0x0

    .line 203
    iput-object v3, p0, Lb8/C;->t:Lb8/f;

    .line 204
    .line 205
    iput v2, p0, Lb8/C;->s:I

    .line 206
    .line 207
    invoke-interface {v1, p1, p0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-ne p1, v0, :cond_e

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_e
    :goto_7
    sget-object v0, LA7/n;->a:LA7/n;

    .line 215
    .line 216
    :goto_8
    return-object v0

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
