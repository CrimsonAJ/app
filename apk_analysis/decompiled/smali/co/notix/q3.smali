.class public final Lco/notix/q3;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:Lg8/a;

.field public b:Lco/notix/c4;

.field public c:I

.field public final synthetic d:Lco/notix/c4;


# direct methods
.method public constructor <init>(Lco/notix/c4;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/q3;->d:Lco/notix/c4;

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
    .locals 1

    .line 1
    new-instance p1, Lco/notix/q3;

    .line 2
    .line 3
    iget-object v0, p0, Lco/notix/q3;->d:Lco/notix/c4;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lco/notix/q3;-><init>(Lco/notix/c4;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/q3;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/q3;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/q3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, Lco/notix/q3;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    if-eqz v1, :cond_4

    .line 11
    .line 12
    if-eq v1, v6, :cond_3

    .line 13
    .line 14
    if-eq v1, v5, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lco/notix/q3;->a:Lg8/a;

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    iget-object v1, p0, Lco/notix/q3;->b:Lco/notix/c4;

    .line 39
    .line 40
    iget-object v5, p0, Lco/notix/q3;->a:Lg8/a;

    .line 41
    .line 42
    :try_start_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_1
    move-exception p1

    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_2
    iget-object v1, p0, Lco/notix/q3;->b:Lco/notix/c4;

    .line 50
    .line 51
    iget-object v5, p0, Lco/notix/q3;->a:Lg8/a;

    .line 52
    .line 53
    :try_start_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    iget-object v1, p0, Lco/notix/q3;->b:Lco/notix/c4;

    .line 58
    .line 59
    iget-object v7, p0, Lco/notix/q3;->a:Lg8/a;

    .line 60
    .line 61
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lco/notix/q3;->d:Lco/notix/c4;

    .line 69
    .line 70
    iget-object v7, v1, Lco/notix/c4;->h:Lg8/a;

    .line 71
    .line 72
    iput-object v7, p0, Lco/notix/q3;->a:Lg8/a;

    .line 73
    .line 74
    iput-object v1, p0, Lco/notix/q3;->b:Lco/notix/c4;

    .line 75
    .line 76
    iput v6, p0, Lco/notix/q3;->c:I

    .line 77
    .line 78
    invoke-interface {v7, p0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    :goto_0
    :try_start_3
    iput-boolean v6, v1, Lco/notix/c4;->j:Z

    .line 86
    .line 87
    iput-object v7, p0, Lco/notix/q3;->a:Lg8/a;

    .line 88
    .line 89
    iput-object v1, p0, Lco/notix/q3;->b:Lco/notix/c4;

    .line 90
    .line 91
    iput v5, p0, Lco/notix/q3;->c:I

    .line 92
    .line 93
    iget-object p1, v1, Lco/notix/c4;->b:Lco/notix/d4;

    .line 94
    .line 95
    iget-object v5, v1, Lco/notix/c4;->a:Lco/notix/o4;

    .line 96
    .line 97
    check-cast p1, Lco/notix/l4;

    .line 98
    .line 99
    invoke-virtual {p1, v5, p0}, Lco/notix/l4;->c(Lco/notix/o4;LE7/d;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 103
    if-ne p1, v0, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    move-object v5, v7

    .line 107
    :goto_1
    :try_start_4
    check-cast p1, Lb8/e;

    .line 108
    .line 109
    iput-object v5, p0, Lco/notix/q3;->a:Lg8/a;

    .line 110
    .line 111
    iput-object v1, p0, Lco/notix/q3;->b:Lco/notix/c4;

    .line 112
    .line 113
    iput v3, p0, Lco/notix/q3;->c:I

    .line 114
    .line 115
    invoke-static {p1, p0}, Lb8/M;->m(Lb8/e;LG7/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v0, :cond_7

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_7
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 123
    .line 124
    invoke-static {p1}, LB7/k;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Lco/notix/t4;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    invoke-interface {v5, v2}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-object v2

    .line 136
    :cond_8
    :try_start_5
    iget-object v6, v1, Lco/notix/c4;->b:Lco/notix/d4;

    .line 137
    .line 138
    iget-object v7, p1, Lco/notix/t4;->a:Ljava/lang/String;

    .line 139
    .line 140
    check-cast v6, Lco/notix/l4;

    .line 141
    .line 142
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const-string v8, "id"

    .line 146
    .line 147
    invoke-static {v7, v8}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v8, v6, Lco/notix/l4;->a:LY7/z;

    .line 151
    .line 152
    new-instance v9, Lco/notix/k4;

    .line 153
    .line 154
    invoke-direct {v9, v6, v7, v2}, Lco/notix/k4;-><init>(Lco/notix/l4;Ljava/lang/String;LE7/d;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v8, v2, v9, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 158
    .line 159
    .line 160
    iget-object v3, v1, Lco/notix/c4;->k:Lb8/E;

    .line 161
    .line 162
    sget-object v6, Lco/notix/qj;->a:Lco/notix/qj;

    .line 163
    .line 164
    invoke-interface {v3, v6}, Lb8/E;->d(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    iget-object p1, p1, Lco/notix/t4;->c:Lco/notix/l;

    .line 168
    .line 169
    iput-object v5, p0, Lco/notix/q3;->a:Lg8/a;

    .line 170
    .line 171
    iput-object v2, p0, Lco/notix/q3;->b:Lco/notix/c4;

    .line 172
    .line 173
    iput v4, p0, Lco/notix/q3;->c:I

    .line 174
    .line 175
    invoke-static {v1, p1, p0}, Lco/notix/c4;->a(Lco/notix/c4;Lco/notix/l;LE7/d;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 179
    if-ne p1, v0, :cond_9

    .line 180
    .line 181
    :goto_3
    return-object v0

    .line 182
    :cond_9
    move-object v0, v5

    .line 183
    :goto_4
    :try_start_6
    check-cast p1, Lco/notix/g;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 184
    .line 185
    invoke-interface {v0, v2}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    return-object p1

    .line 189
    :goto_5
    move-object v7, v0

    .line 190
    goto :goto_7

    .line 191
    :goto_6
    move-object v7, v5

    .line 192
    goto :goto_7

    .line 193
    :catchall_2
    move-exception p1

    .line 194
    :goto_7
    invoke-interface {v7, v2}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    throw p1
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
.end method
