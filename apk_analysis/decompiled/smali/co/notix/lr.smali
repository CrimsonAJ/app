.class public abstract Lco/notix/lr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lco/notix/no;LO7/p;LO7/l;LE7/d;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lco/notix/kr;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lco/notix/kr;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/kr;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/kr;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/kr;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lco/notix/kr;-><init>(LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lco/notix/kr;->f:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/kr;->g:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lco/notix/kr;->e:Ljava/lang/Throwable;

    .line 37
    .line 38
    iget-object p1, v0, Lco/notix/kr;->d:Ljava/util/Iterator;

    .line 39
    .line 40
    iget-object p2, v0, Lco/notix/kr;->c:LO7/l;

    .line 41
    .line 42
    iget-object v2, v0, Lco/notix/kr;->b:LO7/p;

    .line 43
    .line 44
    iget-object v4, v0, Lco/notix/kr;->a:Lco/notix/no;

    .line 45
    .line 46
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p3, LT7/c;

    .line 63
    .line 64
    iget v2, p0, Lco/notix/no;->a:I

    .line 65
    .line 66
    invoke-direct {p3, v3, v2, v3}, LT7/a;-><init>(III)V

    .line 67
    .line 68
    .line 69
    new-instance v2, Ljava/lang/Throwable;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, LT7/a;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    move-object v8, p2

    .line 79
    move-object p2, p1

    .line 80
    move-object p1, p3

    .line 81
    move-object p3, v8

    .line 82
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_7

    .line 87
    .line 88
    move-object v2, p1

    .line 89
    check-cast v2, LB7/x;

    .line 90
    .line 91
    invoke-virtual {v2}, LB7/x;->a()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :try_start_0
    new-instance v4, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-direct {v4, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p3, v4}, LO7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    goto :goto_2

    .line 105
    :catchall_0
    move-exception v4

    .line 106
    invoke-static {v4}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    :goto_2
    invoke-static {v4}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    if-nez v5, :cond_3

    .line 115
    .line 116
    return-object v4

    .line 117
    :cond_3
    if-eqz p2, :cond_4

    .line 118
    .line 119
    new-instance v4, Ljava/lang/Integer;

    .line 120
    .line 121
    invoke-direct {v4, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p2, v4, v5}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_4
    iget v4, p0, Lco/notix/no;->a:I

    .line 128
    .line 129
    if-ge v2, v4, :cond_6

    .line 130
    .line 131
    iget-object v4, p0, Lco/notix/no;->b:Lco/notix/mo;

    .line 132
    .line 133
    invoke-virtual {v4, v2}, Lco/notix/mo;->a(I)J

    .line 134
    .line 135
    .line 136
    move-result-wide v6

    .line 137
    iput-object p0, v0, Lco/notix/kr;->a:Lco/notix/no;

    .line 138
    .line 139
    iput-object p2, v0, Lco/notix/kr;->b:LO7/p;

    .line 140
    .line 141
    iput-object p3, v0, Lco/notix/kr;->c:LO7/l;

    .line 142
    .line 143
    iput-object p1, v0, Lco/notix/kr;->d:Ljava/util/Iterator;

    .line 144
    .line 145
    iput-object v5, v0, Lco/notix/kr;->e:Ljava/lang/Throwable;

    .line 146
    .line 147
    iput v3, v0, Lco/notix/kr;->g:I

    .line 148
    .line 149
    invoke-static {v6, v7, v0}, LY7/B;->g(JLE7/d;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-ne v2, v1, :cond_5

    .line 154
    .line 155
    return-object v1

    .line 156
    :cond_5
    move-object v4, p0

    .line 157
    move-object v2, p2

    .line 158
    move-object p2, p3

    .line 159
    move-object p0, v5

    .line 160
    :goto_3
    move-object p3, p2

    .line 161
    move-object p2, v2

    .line 162
    move-object v2, p0

    .line 163
    move-object p0, v4

    .line 164
    goto :goto_1

    .line 165
    :cond_6
    move-object v2, v5

    .line 166
    goto :goto_1

    .line 167
    :cond_7
    invoke-static {v2}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0
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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
.end method
