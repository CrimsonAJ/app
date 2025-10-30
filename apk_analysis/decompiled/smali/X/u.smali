.class public final LX/u;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public r:LX/c;

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:LX/O;


# direct methods
.method public constructor <init>(LX/O;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX/u;->u:LX/O;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, LX/u;

    .line 2
    .line 3
    iget-object v1, p0, LX/u;->u:LX/O;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LX/u;-><init>(LX/O;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LX/u;->t:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb8/f;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LX/u;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LX/u;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LX/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, LX/u;->s:I

    .line 4
    .line 5
    sget-object v2, LA7/n;->a:LA7/n;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, LX/u;->u:LX/O;

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eq v1, v4, :cond_2

    .line 16
    .line 17
    if-eq v1, v6, :cond_1

    .line 18
    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v1, p0, LX/u;->r:LX/c;

    .line 34
    .line 35
    iget-object v4, p0, LX/u;->t:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Lb8/f;

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v1, p0, LX/u;->t:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lb8/f;

    .line 46
    .line 47
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v4, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LX/u;->t:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lb8/f;

    .line 58
    .line 59
    iput-object p1, p0, LX/u;->t:Ljava/lang/Object;

    .line 60
    .line 61
    iput v4, p0, LX/u;->s:I

    .line 62
    .line 63
    iget-object v1, v5, LX/O;->c:LY7/z;

    .line 64
    .line 65
    invoke-interface {v1}, LY7/z;->g()LE7/i;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v4, LX/H;

    .line 70
    .line 71
    invoke-direct {v4, v5, v7}, LX/H;-><init>(LX/O;LE7/d;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v4, p0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-ne v1, v0, :cond_4

    .line 79
    .line 80
    goto/16 :goto_3

    .line 81
    .line 82
    :cond_4
    move-object v4, p1

    .line 83
    move-object p1, v1

    .line 84
    :goto_0
    move-object v1, p1

    .line 85
    check-cast v1, LX/Z;

    .line 86
    .line 87
    instance-of p1, v1, LX/c;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    move-object p1, v1

    .line 92
    check-cast p1, LX/c;

    .line 93
    .line 94
    iget-object p1, p1, LX/c;->b:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v4, p0, LX/u;->t:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v8, v1

    .line 99
    check-cast v8, LX/c;

    .line 100
    .line 101
    iput-object v8, p0, LX/u;->r:LX/c;

    .line 102
    .line 103
    iput v6, p0, LX/u;->s:I

    .line 104
    .line 105
    invoke-interface {v4, p1, p0}, Lb8/f;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v0, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    instance-of p1, v1, LX/a0;

    .line 113
    .line 114
    if-nez p1, :cond_b

    .line 115
    .line 116
    instance-of p1, v1, LX/S;

    .line 117
    .line 118
    if-nez p1, :cond_a

    .line 119
    .line 120
    instance-of p1, v1, LX/P;

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    :goto_1
    iget-object p1, v5, LX/O;->h:LG0/s;

    .line 126
    .line 127
    iget-object p1, p1, LG0/s;->a:Lb8/Q;

    .line 128
    .line 129
    new-instance v8, LX/n;

    .line 130
    .line 131
    invoke-direct {v8, v5, v7}, LX/n;-><init>(LX/O;LE7/d;)V

    .line 132
    .line 133
    .line 134
    new-instance v9, Lb8/m;

    .line 135
    .line 136
    const/4 v10, 0x0

    .line 137
    invoke-direct {v9, v8, v10, p1}, Lb8/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    new-instance p1, LX/o;

    .line 141
    .line 142
    invoke-direct {p1, v6, v7}, LG7/j;-><init>(ILE7/d;)V

    .line 143
    .line 144
    .line 145
    new-instance v6, Lb8/s;

    .line 146
    .line 147
    const/4 v8, 0x1

    .line 148
    invoke-direct {v6, v9, p1, v8}, Lb8/s;-><init>(Lb8/e;LO7/p;I)V

    .line 149
    .line 150
    .line 151
    new-instance p1, LX/p;

    .line 152
    .line 153
    invoke-direct {p1, v1, v7}, LX/p;-><init>(LX/Z;LE7/d;)V

    .line 154
    .line 155
    .line 156
    new-instance v1, Lb8/s;

    .line 157
    .line 158
    const/4 v8, 0x0

    .line 159
    invoke-direct {v1, v6, p1, v8}, Lb8/s;-><init>(Lb8/e;LO7/p;I)V

    .line 160
    .line 161
    .line 162
    new-instance p1, LX/t;

    .line 163
    .line 164
    const/4 v6, 0x0

    .line 165
    invoke-direct {p1, v1, v6}, LX/t;-><init>(Lb8/e;I)V

    .line 166
    .line 167
    .line 168
    new-instance v1, LX/q;

    .line 169
    .line 170
    invoke-direct {v1, v5, v7}, LX/q;-><init>(LX/O;LE7/d;)V

    .line 171
    .line 172
    .line 173
    new-instance v5, Lb8/k;

    .line 174
    .line 175
    invoke-direct {v5, p1, v1}, Lb8/k;-><init>(LX/t;LX/q;)V

    .line 176
    .line 177
    .line 178
    iput-object v7, p0, LX/u;->t:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v7, p0, LX/u;->r:LX/c;

    .line 181
    .line 182
    iput v3, p0, LX/u;->s:I

    .line 183
    .line 184
    instance-of p1, v4, Lb8/T;

    .line 185
    .line 186
    if-nez p1, :cond_9

    .line 187
    .line 188
    invoke-virtual {v5, v4, p0}, Lb8/k;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-ne p1, v0, :cond_7

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_7
    move-object p1, v2

    .line 196
    :goto_2
    if-ne p1, v0, :cond_8

    .line 197
    .line 198
    :goto_3
    return-object v0

    .line 199
    :cond_8
    :goto_4
    return-object v2

    .line 200
    :cond_9
    check-cast v4, Lb8/T;

    .line 201
    .line 202
    iget-object p1, v4, Lb8/T;->a:Ljava/lang/Throwable;

    .line 203
    .line 204
    throw p1

    .line 205
    :cond_a
    check-cast v1, LX/S;

    .line 206
    .line 207
    iget-object p1, v1, LX/S;->b:Ljava/lang/Throwable;

    .line 208
    .line 209
    throw p1

    .line 210
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 213
    .line 214
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p1
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
