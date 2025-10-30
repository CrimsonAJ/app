.class public final Lj3/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final s:LN3/A;


# instance fields
.field public final a:Lj3/E0;

.field public final b:LN3/A;

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Lj3/m;

.field public final g:Z

.field public final h:LN3/n0;

.field public final i:Li4/w;

.field public final j:Ljava/util/List;

.field public final k:LN3/A;

.field public final l:Z

.field public final m:I

.field public final n:Lj3/m0;

.field public final o:Z

.field public volatile p:J

.field public volatile q:J

.field public volatile r:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN3/A;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, LN3/A;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lj3/l0;->s:LN3/A;

    .line 12
    .line 13
    return-void
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
.end method

.method public constructor <init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj3/l0;->a:Lj3/E0;

    .line 3
    iput-object p2, p0, Lj3/l0;->b:LN3/A;

    .line 4
    iput-wide p3, p0, Lj3/l0;->c:J

    .line 5
    iput-wide p5, p0, Lj3/l0;->d:J

    .line 6
    iput p7, p0, Lj3/l0;->e:I

    .line 7
    iput-object p8, p0, Lj3/l0;->f:Lj3/m;

    .line 8
    iput-boolean p9, p0, Lj3/l0;->g:Z

    .line 9
    iput-object p10, p0, Lj3/l0;->h:LN3/n0;

    .line 10
    iput-object p11, p0, Lj3/l0;->i:Li4/w;

    .line 11
    iput-object p12, p0, Lj3/l0;->j:Ljava/util/List;

    .line 12
    iput-object p13, p0, Lj3/l0;->k:LN3/A;

    .line 13
    iput-boolean p14, p0, Lj3/l0;->l:Z

    .line 14
    iput p15, p0, Lj3/l0;->m:I

    move-object/from16 p1, p16

    .line 15
    iput-object p1, p0, Lj3/l0;->n:Lj3/m0;

    move-wide/from16 p1, p17

    .line 16
    iput-wide p1, p0, Lj3/l0;->p:J

    move-wide/from16 p1, p19

    .line 17
    iput-wide p1, p0, Lj3/l0;->q:J

    move-wide/from16 p1, p21

    .line 18
    iput-wide p1, p0, Lj3/l0;->r:J

    move/from16 p1, p23

    .line 19
    iput-boolean p1, p0, Lj3/l0;->o:Z

    return-void
.end method

.method public static h(Li4/w;)Lj3/l0;
    .locals 24

    .line 1
    new-instance v0, Lj3/l0;

    .line 2
    .line 3
    sget-object v1, Lj3/E0;->a:Lj3/B0;

    .line 4
    .line 5
    sget-object v2, Lj3/l0;->s:LN3/A;

    .line 6
    .line 7
    sget-object v10, LN3/n0;->d:LN3/n0;

    .line 8
    .line 9
    sget-object v12, LP5/S;->e:LP5/S;

    .line 10
    .line 11
    sget-object v16, Lj3/m0;->d:Lj3/m0;

    .line 12
    .line 13
    const-wide/16 v17, 0x0

    .line 14
    .line 15
    const-wide/16 v19, 0x0

    .line 16
    .line 17
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    const/4 v7, 0x1

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const-wide/16 v21, 0x0

    .line 30
    .line 31
    const/16 v23, 0x0

    .line 32
    .line 33
    move-object v13, v2

    .line 34
    move-object/from16 v11, p0

    .line 35
    .line 36
    invoke-direct/range {v0 .. v23}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 37
    .line 38
    .line 39
    return-object v0
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
.end method


# virtual methods
.method public final a(LN3/A;)Lj3/l0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj3/l0;

    .line 4
    .line 5
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget-object v3, v0, Lj3/l0;->b:LN3/A;

    .line 8
    .line 9
    iget-wide v4, v0, Lj3/l0;->c:J

    .line 10
    .line 11
    iget-wide v6, v0, Lj3/l0;->d:J

    .line 12
    .line 13
    iget v8, v0, Lj3/l0;->e:I

    .line 14
    .line 15
    iget-object v9, v0, Lj3/l0;->f:Lj3/m;

    .line 16
    .line 17
    iget-boolean v10, v0, Lj3/l0;->g:Z

    .line 18
    .line 19
    iget-object v11, v0, Lj3/l0;->h:LN3/n0;

    .line 20
    .line 21
    iget-object v12, v0, Lj3/l0;->i:Li4/w;

    .line 22
    .line 23
    iget-object v13, v0, Lj3/l0;->j:Ljava/util/List;

    .line 24
    .line 25
    iget-boolean v15, v0, Lj3/l0;->l:Z

    .line 26
    .line 27
    iget v14, v0, Lj3/l0;->m:I

    .line 28
    .line 29
    move-object/from16 v16, v1

    .line 30
    .line 31
    iget-object v1, v0, Lj3/l0;->n:Lj3/m0;

    .line 32
    .line 33
    move-object/from16 v18, v1

    .line 34
    .line 35
    move-object/from16 v17, v2

    .line 36
    .line 37
    iget-wide v1, v0, Lj3/l0;->p:J

    .line 38
    .line 39
    move-wide/from16 v19, v1

    .line 40
    .line 41
    iget-wide v1, v0, Lj3/l0;->q:J

    .line 42
    .line 43
    move-wide/from16 v21, v1

    .line 44
    .line 45
    iget-wide v1, v0, Lj3/l0;->r:J

    .line 46
    .line 47
    move-wide/from16 v23, v1

    .line 48
    .line 49
    iget-boolean v1, v0, Lj3/l0;->o:Z

    .line 50
    .line 51
    move-object/from16 v2, v17

    .line 52
    .line 53
    move-object/from16 v17, v18

    .line 54
    .line 55
    move-wide/from16 v18, v19

    .line 56
    .line 57
    move-wide/from16 v20, v21

    .line 58
    .line 59
    move-wide/from16 v22, v23

    .line 60
    .line 61
    move/from16 v24, v1

    .line 62
    .line 63
    move-object/from16 v1, v16

    .line 64
    .line 65
    move/from16 v16, v14

    .line 66
    .line 67
    move-object/from16 v14, p1

    .line 68
    .line 69
    invoke-direct/range {v1 .. v24}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v16, v1

    .line 73
    .line 74
    return-object v16
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
.end method

.method public final b(LN3/A;JJJJLN3/n0;Li4/w;Ljava/util/List;)Lj3/l0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj3/l0;

    .line 4
    .line 5
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget v8, v0, Lj3/l0;->e:I

    .line 8
    .line 9
    iget-object v9, v0, Lj3/l0;->f:Lj3/m;

    .line 10
    .line 11
    iget-boolean v10, v0, Lj3/l0;->g:Z

    .line 12
    .line 13
    iget-object v14, v0, Lj3/l0;->k:LN3/A;

    .line 14
    .line 15
    iget-boolean v15, v0, Lj3/l0;->l:Z

    .line 16
    .line 17
    iget v3, v0, Lj3/l0;->m:I

    .line 18
    .line 19
    iget-object v4, v0, Lj3/l0;->n:Lj3/m0;

    .line 20
    .line 21
    iget-wide v5, v0, Lj3/l0;->p:J

    .line 22
    .line 23
    iget-boolean v7, v0, Lj3/l0;->o:Z

    .line 24
    .line 25
    move-wide/from16 v22, p2

    .line 26
    .line 27
    move-wide/from16 v20, p8

    .line 28
    .line 29
    move-object/from16 v11, p10

    .line 30
    .line 31
    move-object/from16 v12, p11

    .line 32
    .line 33
    move-object/from16 v13, p12

    .line 34
    .line 35
    move/from16 v16, v3

    .line 36
    .line 37
    move-object/from16 v17, v4

    .line 38
    .line 39
    move-wide/from16 v18, v5

    .line 40
    .line 41
    move/from16 v24, v7

    .line 42
    .line 43
    move-object/from16 v3, p1

    .line 44
    .line 45
    move-wide/from16 v4, p4

    .line 46
    .line 47
    move-wide/from16 v6, p6

    .line 48
    .line 49
    invoke-direct/range {v1 .. v24}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 50
    .line 51
    .line 52
    return-object v1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
    .line 263
.end method

.method public final c(IZ)Lj3/l0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj3/l0;

    .line 4
    .line 5
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget-object v3, v0, Lj3/l0;->b:LN3/A;

    .line 8
    .line 9
    iget-wide v4, v0, Lj3/l0;->c:J

    .line 10
    .line 11
    iget-wide v6, v0, Lj3/l0;->d:J

    .line 12
    .line 13
    iget v8, v0, Lj3/l0;->e:I

    .line 14
    .line 15
    iget-object v9, v0, Lj3/l0;->f:Lj3/m;

    .line 16
    .line 17
    iget-boolean v10, v0, Lj3/l0;->g:Z

    .line 18
    .line 19
    iget-object v11, v0, Lj3/l0;->h:LN3/n0;

    .line 20
    .line 21
    iget-object v12, v0, Lj3/l0;->i:Li4/w;

    .line 22
    .line 23
    iget-object v13, v0, Lj3/l0;->j:Ljava/util/List;

    .line 24
    .line 25
    iget-object v14, v0, Lj3/l0;->k:LN3/A;

    .line 26
    .line 27
    iget-object v15, v0, Lj3/l0;->n:Lj3/m0;

    .line 28
    .line 29
    move-object/from16 v16, v1

    .line 30
    .line 31
    move-object/from16 v17, v2

    .line 32
    .line 33
    iget-wide v1, v0, Lj3/l0;->p:J

    .line 34
    .line 35
    move-wide/from16 v18, v1

    .line 36
    .line 37
    iget-wide v1, v0, Lj3/l0;->q:J

    .line 38
    .line 39
    move-wide/from16 v20, v1

    .line 40
    .line 41
    iget-wide v1, v0, Lj3/l0;->r:J

    .line 42
    .line 43
    move-wide/from16 v22, v1

    .line 44
    .line 45
    iget-boolean v1, v0, Lj3/l0;->o:Z

    .line 46
    .line 47
    move/from16 v24, v1

    .line 48
    .line 49
    move-object/from16 v1, v16

    .line 50
    .line 51
    move-object/from16 v2, v17

    .line 52
    .line 53
    move/from16 v16, p1

    .line 54
    .line 55
    move-object/from16 v17, v15

    .line 56
    .line 57
    move/from16 v15, p2

    .line 58
    .line 59
    invoke-direct/range {v1 .. v24}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v16, v1

    .line 63
    .line 64
    return-object v16
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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

.method public final d(Lj3/m;)Lj3/l0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj3/l0;

    .line 4
    .line 5
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget-object v3, v0, Lj3/l0;->b:LN3/A;

    .line 8
    .line 9
    iget-wide v4, v0, Lj3/l0;->c:J

    .line 10
    .line 11
    iget-wide v6, v0, Lj3/l0;->d:J

    .line 12
    .line 13
    iget v8, v0, Lj3/l0;->e:I

    .line 14
    .line 15
    iget-boolean v10, v0, Lj3/l0;->g:Z

    .line 16
    .line 17
    iget-object v11, v0, Lj3/l0;->h:LN3/n0;

    .line 18
    .line 19
    iget-object v12, v0, Lj3/l0;->i:Li4/w;

    .line 20
    .line 21
    iget-object v13, v0, Lj3/l0;->j:Ljava/util/List;

    .line 22
    .line 23
    iget-object v14, v0, Lj3/l0;->k:LN3/A;

    .line 24
    .line 25
    iget-boolean v15, v0, Lj3/l0;->l:Z

    .line 26
    .line 27
    iget v9, v0, Lj3/l0;->m:I

    .line 28
    .line 29
    move-object/from16 v16, v1

    .line 30
    .line 31
    iget-object v1, v0, Lj3/l0;->n:Lj3/m0;

    .line 32
    .line 33
    move-object/from16 v18, v1

    .line 34
    .line 35
    move-object/from16 v17, v2

    .line 36
    .line 37
    iget-wide v1, v0, Lj3/l0;->p:J

    .line 38
    .line 39
    move-wide/from16 v19, v1

    .line 40
    .line 41
    iget-wide v1, v0, Lj3/l0;->q:J

    .line 42
    .line 43
    move-wide/from16 v21, v1

    .line 44
    .line 45
    iget-wide v1, v0, Lj3/l0;->r:J

    .line 46
    .line 47
    move-wide/from16 v23, v1

    .line 48
    .line 49
    iget-boolean v1, v0, Lj3/l0;->o:Z

    .line 50
    .line 51
    move-object/from16 v2, v17

    .line 52
    .line 53
    move-object/from16 v17, v18

    .line 54
    .line 55
    move-wide/from16 v18, v19

    .line 56
    .line 57
    move-wide/from16 v20, v21

    .line 58
    .line 59
    move-wide/from16 v22, v23

    .line 60
    .line 61
    move/from16 v24, v1

    .line 62
    .line 63
    move-object/from16 v1, v16

    .line 64
    .line 65
    move/from16 v16, v9

    .line 66
    .line 67
    move-object/from16 v9, p1

    .line 68
    .line 69
    invoke-direct/range {v1 .. v24}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v16, v1

    .line 73
    .line 74
    return-object v16
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
.end method

.method public final e(Lj3/m0;)Lj3/l0;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj3/l0;

    .line 4
    .line 5
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget-object v3, v0, Lj3/l0;->b:LN3/A;

    .line 8
    .line 9
    iget-wide v4, v0, Lj3/l0;->c:J

    .line 10
    .line 11
    iget-wide v6, v0, Lj3/l0;->d:J

    .line 12
    .line 13
    iget v8, v0, Lj3/l0;->e:I

    .line 14
    .line 15
    iget-object v9, v0, Lj3/l0;->f:Lj3/m;

    .line 16
    .line 17
    iget-boolean v10, v0, Lj3/l0;->g:Z

    .line 18
    .line 19
    iget-object v11, v0, Lj3/l0;->h:LN3/n0;

    .line 20
    .line 21
    iget-object v12, v0, Lj3/l0;->i:Li4/w;

    .line 22
    .line 23
    iget-object v13, v0, Lj3/l0;->j:Ljava/util/List;

    .line 24
    .line 25
    iget-object v14, v0, Lj3/l0;->k:LN3/A;

    .line 26
    .line 27
    iget-boolean v15, v0, Lj3/l0;->l:Z

    .line 28
    .line 29
    move-object/from16 v16, v1

    .line 30
    .line 31
    iget v1, v0, Lj3/l0;->m:I

    .line 32
    .line 33
    move/from16 v18, v1

    .line 34
    .line 35
    move-object/from16 v17, v2

    .line 36
    .line 37
    iget-wide v1, v0, Lj3/l0;->p:J

    .line 38
    .line 39
    move-wide/from16 v19, v1

    .line 40
    .line 41
    iget-wide v1, v0, Lj3/l0;->q:J

    .line 42
    .line 43
    move-wide/from16 v21, v1

    .line 44
    .line 45
    iget-wide v1, v0, Lj3/l0;->r:J

    .line 46
    .line 47
    move-wide/from16 v23, v1

    .line 48
    .line 49
    iget-boolean v1, v0, Lj3/l0;->o:Z

    .line 50
    .line 51
    move-wide/from16 v25, v23

    .line 52
    .line 53
    move/from16 v24, v1

    .line 54
    .line 55
    move-object/from16 v1, v16

    .line 56
    .line 57
    move/from16 v16, v18

    .line 58
    .line 59
    move-wide/from16 v18, v19

    .line 60
    .line 61
    move-wide/from16 v20, v21

    .line 62
    .line 63
    move-wide/from16 v22, v25

    .line 64
    .line 65
    move-object/from16 v2, v17

    .line 66
    .line 67
    move-object/from16 v17, p1

    .line 68
    .line 69
    invoke-direct/range {v1 .. v24}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v16, v1

    .line 73
    .line 74
    return-object v16
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
.end method

.method public final f(I)Lj3/l0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj3/l0;

    .line 4
    .line 5
    iget-object v2, v0, Lj3/l0;->a:Lj3/E0;

    .line 6
    .line 7
    iget-object v3, v0, Lj3/l0;->b:LN3/A;

    .line 8
    .line 9
    iget-wide v4, v0, Lj3/l0;->c:J

    .line 10
    .line 11
    iget-wide v6, v0, Lj3/l0;->d:J

    .line 12
    .line 13
    iget-object v9, v0, Lj3/l0;->f:Lj3/m;

    .line 14
    .line 15
    iget-boolean v10, v0, Lj3/l0;->g:Z

    .line 16
    .line 17
    iget-object v11, v0, Lj3/l0;->h:LN3/n0;

    .line 18
    .line 19
    iget-object v12, v0, Lj3/l0;->i:Li4/w;

    .line 20
    .line 21
    iget-object v13, v0, Lj3/l0;->j:Ljava/util/List;

    .line 22
    .line 23
    iget-object v14, v0, Lj3/l0;->k:LN3/A;

    .line 24
    .line 25
    iget-boolean v15, v0, Lj3/l0;->l:Z

    .line 26
    .line 27
    iget v8, v0, Lj3/l0;->m:I

    .line 28
    .line 29
    move-object/from16 v16, v1

    .line 30
    .line 31
    iget-object v1, v0, Lj3/l0;->n:Lj3/m0;

    .line 32
    .line 33
    move-object/from16 v18, v1

    .line 34
    .line 35
    move-object/from16 v17, v2

    .line 36
    .line 37
    iget-wide v1, v0, Lj3/l0;->p:J

    .line 38
    .line 39
    move-wide/from16 v19, v1

    .line 40
    .line 41
    iget-wide v1, v0, Lj3/l0;->q:J

    .line 42
    .line 43
    move-wide/from16 v21, v1

    .line 44
    .line 45
    iget-wide v1, v0, Lj3/l0;->r:J

    .line 46
    .line 47
    move-wide/from16 v23, v1

    .line 48
    .line 49
    iget-boolean v1, v0, Lj3/l0;->o:Z

    .line 50
    .line 51
    move-object/from16 v2, v17

    .line 52
    .line 53
    move-object/from16 v17, v18

    .line 54
    .line 55
    move-wide/from16 v18, v19

    .line 56
    .line 57
    move-wide/from16 v20, v21

    .line 58
    .line 59
    move-wide/from16 v22, v23

    .line 60
    .line 61
    move/from16 v24, v1

    .line 62
    .line 63
    move-object/from16 v1, v16

    .line 64
    .line 65
    move/from16 v16, v8

    .line 66
    .line 67
    move/from16 v8, p1

    .line 68
    .line 69
    invoke-direct/range {v1 .. v24}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v16, v1

    .line 73
    .line 74
    return-object v16
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
.end method

.method public final g(Lj3/E0;)Lj3/l0;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lj3/l0;

    .line 4
    .line 5
    iget-object v3, v0, Lj3/l0;->b:LN3/A;

    .line 6
    .line 7
    iget-wide v4, v0, Lj3/l0;->c:J

    .line 8
    .line 9
    iget-wide v6, v0, Lj3/l0;->d:J

    .line 10
    .line 11
    iget v8, v0, Lj3/l0;->e:I

    .line 12
    .line 13
    iget-object v9, v0, Lj3/l0;->f:Lj3/m;

    .line 14
    .line 15
    iget-boolean v10, v0, Lj3/l0;->g:Z

    .line 16
    .line 17
    iget-object v11, v0, Lj3/l0;->h:LN3/n0;

    .line 18
    .line 19
    iget-object v12, v0, Lj3/l0;->i:Li4/w;

    .line 20
    .line 21
    iget-object v13, v0, Lj3/l0;->j:Ljava/util/List;

    .line 22
    .line 23
    iget-object v14, v0, Lj3/l0;->k:LN3/A;

    .line 24
    .line 25
    iget-boolean v15, v0, Lj3/l0;->l:Z

    .line 26
    .line 27
    iget v2, v0, Lj3/l0;->m:I

    .line 28
    .line 29
    move-object/from16 v16, v1

    .line 30
    .line 31
    iget-object v1, v0, Lj3/l0;->n:Lj3/m0;

    .line 32
    .line 33
    move-object/from16 v18, v1

    .line 34
    .line 35
    move/from16 v17, v2

    .line 36
    .line 37
    iget-wide v1, v0, Lj3/l0;->p:J

    .line 38
    .line 39
    move-wide/from16 v19, v1

    .line 40
    .line 41
    iget-wide v1, v0, Lj3/l0;->q:J

    .line 42
    .line 43
    move-wide/from16 v21, v1

    .line 44
    .line 45
    iget-wide v1, v0, Lj3/l0;->r:J

    .line 46
    .line 47
    move-wide/from16 v23, v1

    .line 48
    .line 49
    iget-boolean v1, v0, Lj3/l0;->o:Z

    .line 50
    .line 51
    move-wide/from16 v25, v23

    .line 52
    .line 53
    move/from16 v24, v1

    .line 54
    .line 55
    move-object/from16 v1, v16

    .line 56
    .line 57
    move/from16 v16, v17

    .line 58
    .line 59
    move-object/from16 v17, v18

    .line 60
    .line 61
    move-wide/from16 v18, v19

    .line 62
    .line 63
    move-wide/from16 v20, v21

    .line 64
    .line 65
    move-wide/from16 v22, v25

    .line 66
    .line 67
    move-object/from16 v2, p1

    .line 68
    .line 69
    invoke-direct/range {v1 .. v24}, Lj3/l0;-><init>(Lj3/E0;LN3/A;JJILj3/m;ZLN3/n0;Li4/w;Ljava/util/List;LN3/A;ZILj3/m0;JJJZ)V

    .line 70
    .line 71
    .line 72
    move-object/from16 v16, v1

    .line 73
    .line 74
    return-object v16
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
.end method
