.class public final Lco/notix/o3;
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
    iput-object p1, p0, Lco/notix/o3;->d:Lco/notix/c4;

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
    new-instance p1, Lco/notix/o3;

    .line 2
    .line 3
    iget-object v0, p0, Lco/notix/o3;->d:Lco/notix/c4;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lco/notix/o3;-><init>(Lco/notix/c4;LE7/d;)V

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
    invoke-virtual {p0, p1, p2}, Lco/notix/o3;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/o3;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/o3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, Lco/notix/o3;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    if-eq v1, v5, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lco/notix/o3;->a:Lg8/a;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v1, p0, Lco/notix/o3;->b:Lco/notix/c4;

    .line 36
    .line 37
    iget-object v4, p0, Lco/notix/o3;->a:Lg8/a;

    .line 38
    .line 39
    :try_start_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_1
    move-exception p1

    .line 44
    goto :goto_4

    .line 45
    :cond_2
    iget-object v1, p0, Lco/notix/o3;->b:Lco/notix/c4;

    .line 46
    .line 47
    iget-object v6, p0, Lco/notix/o3;->a:Lg8/a;

    .line 48
    .line 49
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lco/notix/o3;->d:Lco/notix/c4;

    .line 57
    .line 58
    iget-object v1, p1, Lco/notix/c4;->h:Lg8/a;

    .line 59
    .line 60
    iput-object v1, p0, Lco/notix/o3;->a:Lg8/a;

    .line 61
    .line 62
    iput-object p1, p0, Lco/notix/o3;->b:Lco/notix/c4;

    .line 63
    .line 64
    iput v5, p0, Lco/notix/o3;->c:I

    .line 65
    .line 66
    invoke-interface {v1, p0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-ne v6, v0, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move-object v6, v1

    .line 74
    move-object v1, p1

    .line 75
    :goto_0
    :try_start_2
    iput-boolean v5, v1, Lco/notix/c4;->j:Z

    .line 76
    .line 77
    iput-object v6, p0, Lco/notix/o3;->a:Lg8/a;

    .line 78
    .line 79
    iput-object v1, p0, Lco/notix/o3;->b:Lco/notix/c4;

    .line 80
    .line 81
    iput v4, p0, Lco/notix/o3;->c:I

    .line 82
    .line 83
    invoke-static {v1, p0}, Lco/notix/c4;->a(Lco/notix/c4;LE7/d;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 87
    if-ne p1, v0, :cond_5

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    move-object v4, v6

    .line 91
    :goto_1
    :try_start_3
    check-cast p1, Lco/notix/t4;

    .line 92
    .line 93
    iget-object v5, v1, Lco/notix/c4;->b:Lco/notix/d4;

    .line 94
    .line 95
    iget-object v6, p1, Lco/notix/t4;->a:Ljava/lang/String;

    .line 96
    .line 97
    check-cast v5, Lco/notix/l4;

    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const-string v7, "id"

    .line 103
    .line 104
    invoke-static {v6, v7}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v7, v5, Lco/notix/l4;->a:LY7/z;

    .line 108
    .line 109
    new-instance v8, Lco/notix/k4;

    .line 110
    .line 111
    invoke-direct {v8, v5, v6, v2}, Lco/notix/k4;-><init>(Lco/notix/l4;Ljava/lang/String;LE7/d;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v7, v2, v8, v3}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 115
    .line 116
    .line 117
    iget-object v5, v1, Lco/notix/c4;->k:Lb8/E;

    .line 118
    .line 119
    sget-object v6, Lco/notix/qj;->a:Lco/notix/qj;

    .line 120
    .line 121
    invoke-interface {v5, v6}, Lb8/E;->d(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-object p1, p1, Lco/notix/t4;->c:Lco/notix/l;

    .line 125
    .line 126
    iput-object v4, p0, Lco/notix/o3;->a:Lg8/a;

    .line 127
    .line 128
    iput-object v2, p0, Lco/notix/o3;->b:Lco/notix/c4;

    .line 129
    .line 130
    iput v3, p0, Lco/notix/o3;->c:I

    .line 131
    .line 132
    invoke-static {v1, p1, p0}, Lco/notix/c4;->a(Lco/notix/c4;Lco/notix/l;LE7/d;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 136
    if-ne p1, v0, :cond_6

    .line 137
    .line 138
    :goto_2
    return-object v0

    .line 139
    :cond_6
    move-object v0, v4

    .line 140
    :goto_3
    :try_start_4
    check-cast p1, Lco/notix/g;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 141
    .line 142
    invoke-interface {v0, v2}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-object p1

    .line 146
    :catchall_2
    move-exception p1

    .line 147
    move-object v4, v6

    .line 148
    :goto_4
    move-object v0, v4

    .line 149
    :goto_5
    invoke-interface {v0, v2}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    throw p1
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
