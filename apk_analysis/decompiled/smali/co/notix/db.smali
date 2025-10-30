.class public final Lco/notix/db;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:Lco/notix/bb;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lco/notix/eb;


# direct methods
.method public constructor <init>(Lco/notix/eb;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/db;->d:Lco/notix/eb;

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
    new-instance v0, Lco/notix/db;

    .line 2
    .line 3
    iget-object v1, p0, Lco/notix/db;->d:Lco/notix/eb;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lco/notix/db;-><init>(Lco/notix/eb;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lco/notix/db;->c:Ljava/lang/Object;

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
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/db;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/db;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/db;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lco/notix/db;->b:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lco/notix/db;->a:Lco/notix/bb;

    .line 11
    .line 12
    iget-object v3, p0, Lco/notix/db;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, LY7/z;

    .line 15
    .line 16
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lco/notix/db;->c:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v3, p1

    .line 34
    check-cast v3, LY7/z;

    .line 35
    .line 36
    new-instance v1, Lco/notix/bb;

    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-direct {v1, p1, v4, v5}, Lco/notix/bb;-><init>(ZJ)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-interface {v3}, LY7/z;->g()LE7/i;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object v4, LY7/g0;->a:LY7/g0;

    .line 51
    .line 52
    invoke-interface {p1, v4}, LE7/i;->get(LE7/h;)LE7/g;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, LY7/h0;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-interface {p1}, LY7/h0;->a()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move p1, v2

    .line 66
    :goto_1
    if-eqz p1, :cond_5

    .line 67
    .line 68
    new-instance p1, Lco/notix/bb;

    .line 69
    .line 70
    iget-object v4, p0, Lco/notix/db;->d:Lco/notix/eb;

    .line 71
    .line 72
    invoke-static {v4}, Lco/notix/eb;->a(Lco/notix/eb;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    invoke-direct {p1, v4, v5, v6}, Lco/notix/bb;-><init>(ZJ)V

    .line 81
    .line 82
    .line 83
    iget-boolean v7, v1, Lco/notix/bb;->a:Z

    .line 84
    .line 85
    if-eqz v7, :cond_3

    .line 86
    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    iget-wide v7, v1, Lco/notix/bb;->b:J

    .line 90
    .line 91
    sub-long/2addr v5, v7

    .line 92
    iget-object v1, p0, Lco/notix/db;->d:Lco/notix/eb;

    .line 93
    .line 94
    iget-object v4, v1, Lco/notix/eb;->b:LY7/z;

    .line 95
    .line 96
    new-instance v7, Lco/notix/cb;

    .line 97
    .line 98
    const/4 v8, 0x0

    .line 99
    invoke-direct {v7, v1, v5, v6, v8}, Lco/notix/cb;-><init>(Lco/notix/eb;JLE7/d;)V

    .line 100
    .line 101
    .line 102
    const/4 v1, 0x3

    .line 103
    invoke-static {v4, v8, v7, v1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 104
    .line 105
    .line 106
    :cond_3
    iput-object v3, p0, Lco/notix/db;->c:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object p1, p0, Lco/notix/db;->a:Lco/notix/bb;

    .line 109
    .line 110
    iput v2, p0, Lco/notix/db;->b:I

    .line 111
    .line 112
    const-wide/16 v4, 0x1388

    .line 113
    .line 114
    invoke-static {v4, v5, p0}, LY7/B;->g(JLE7/d;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-ne v1, v0, :cond_4

    .line 119
    .line 120
    return-object v0

    .line 121
    :cond_4
    move-object v1, p1

    .line 122
    goto :goto_0

    .line 123
    :cond_5
    sget-object p1, LA7/n;->a:LA7/n;

    .line 124
    .line 125
    return-object p1
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
