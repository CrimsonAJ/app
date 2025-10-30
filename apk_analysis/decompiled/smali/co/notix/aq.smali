.class public final Lco/notix/aq;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public a:J

.field public b:J

.field public c:Lco/notix/xp;

.field public d:I

.field public final synthetic e:Lco/notix/mq;


# direct methods
.method public constructor <init>(Lco/notix/mq;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/aq;->e:Lco/notix/mq;

    .line 2
    .line 3
    const/4 p1, 0x1

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
.method public final create(LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, Lco/notix/aq;

    .line 2
    .line 3
    iget-object v1, p0, Lco/notix/aq;->e:Lco/notix/mq;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lco/notix/aq;-><init>(Lco/notix/mq;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LE7/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lco/notix/aq;->create(LE7/d;)LE7/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lco/notix/aq;

    .line 8
    .line 9
    sget-object v0, LA7/n;->a:LA7/n;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lco/notix/aq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, Lco/notix/aq;->d:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lco/notix/aq;->b:J

    .line 14
    .line 15
    iget-wide v2, p0, Lco/notix/aq;->a:J

    .line 16
    .line 17
    iget-object v4, p0, Lco/notix/aq;->c:Lco/notix/xp;

    .line 18
    .line 19
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object v6, v4

    .line 23
    move-wide v4, v0

    .line 24
    goto :goto_2

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
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lco/notix/aq;->e:Lco/notix/mq;

    .line 41
    .line 42
    iget-object p1, p1, Lco/notix/mq;->d:Lco/notix/er;

    .line 43
    .line 44
    iput v3, p0, Lco/notix/aq;->d:I

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    :goto_0
    check-cast p1, Lco/notix/yh;

    .line 54
    .line 55
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 56
    .line 57
    const-wide/16 v3, 0x3c

    .line 58
    .line 59
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    const-wide/16 v5, 0x3

    .line 64
    .line 65
    invoke-virtual {v1, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    new-instance v1, Lco/notix/xp;

    .line 70
    .line 71
    iget-object v7, p0, Lco/notix/aq;->e:Lco/notix/mq;

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct {v1, v7, v8}, Lco/notix/xp;-><init>(Lco/notix/mq;LE7/d;)V

    .line 75
    .line 76
    .line 77
    new-instance v7, Lco/notix/yp;

    .line 78
    .line 79
    invoke-direct {v7, p1}, Lco/notix/yp;-><init>(Lco/notix/yh;)V

    .line 80
    .line 81
    .line 82
    new-instance v8, Lco/notix/zp;

    .line 83
    .line 84
    invoke-direct {v8, p1}, Lco/notix/zp;-><init>(Lco/notix/yh;)V

    .line 85
    .line 86
    .line 87
    iput-object v1, p0, Lco/notix/aq;->c:Lco/notix/xp;

    .line 88
    .line 89
    iput-wide v3, p0, Lco/notix/aq;->a:J

    .line 90
    .line 91
    iput-wide v5, p0, Lco/notix/aq;->b:J

    .line 92
    .line 93
    iput v2, p0, Lco/notix/aq;->d:I

    .line 94
    .line 95
    const-string v2, "c"

    .line 96
    .line 97
    invoke-virtual {p1, v2, v7, v8, p0}, Lco/notix/yh;->a(Ljava/lang/String;LO7/l;LO7/l;LE7/d;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v0, :cond_4

    .line 102
    .line 103
    :goto_1
    return-object v0

    .line 104
    :cond_4
    move-wide v2, v3

    .line 105
    move-wide v4, v5

    .line 106
    move-object v6, v1

    .line 107
    :goto_2
    move-object v1, p1

    .line 108
    check-cast v1, Lco/notix/vh;

    .line 109
    .line 110
    new-instance v0, Lco/notix/r7;

    .line 111
    .line 112
    invoke-direct/range {v0 .. v6}, Lco/notix/r7;-><init>(Lco/notix/vh;JJLO7/l;)V

    .line 113
    .line 114
    .line 115
    return-object v0
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
