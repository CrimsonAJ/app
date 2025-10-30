.class public final LQ3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:J

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LQ3/j;->a:I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-wide p1, p0, LQ3/j;->b:J

    .line 39
    iput-object p3, p0, LQ3/j;->e:Ljava/lang/Object;

    .line 40
    iput-object p4, p0, LQ3/j;->f:Ljava/lang/Object;

    .line 41
    iput-wide p6, p0, LQ3/j;->c:J

    .line 42
    iput-object p5, p0, LQ3/j;->d:Ljava/lang/Object;

    .line 43
    iput-object p8, p0, LQ3/j;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb5/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LQ3/j;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, LF4/y;->e(Ljava/lang/String;)V

    .line 2
    invoke-static {p4}, LF4/y;->e(Ljava/lang/String;)V

    iput-object p3, p0, LQ3/j;->d:Ljava/lang/Object;

    iput-object p4, p0, LQ3/j;->e:Ljava/lang/Object;

    const/4 p4, 0x1

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-ne p4, v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, LQ3/j;->f:Ljava/lang/Object;

    iput-wide p5, p0, LQ3/j;->b:J

    iput-wide p7, p0, LQ3/j;->c:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    .line 4
    iget-object p2, p1, Lb5/n0;->i:Lb5/V;

    .line 5
    invoke-static {p2}, Lb5/n0;->f(Lb5/x0;)V

    .line 6
    invoke-static {p3}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object p3

    const-string p4, "Event created with reverse previous/current timestamps. appId"

    .line 7
    iget-object p2, p2, Lb5/V;->i:Lb5/T;

    invoke-virtual {p2, p3, p4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    if-eqz p9, :cond_5

    .line 8
    invoke-virtual {p9}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    new-instance p2, Landroid/os/Bundle;

    .line 9
    invoke-direct {p2, p9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 10
    invoke-virtual {p2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    .line 11
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    .line 12
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-nez p4, :cond_2

    .line 13
    iget-object p4, p1, Lb5/n0;->i:Lb5/V;

    .line 14
    invoke-static {p4}, Lb5/n0;->f(Lb5/x0;)V

    .line 15
    const-string p5, "Param name can\'t be null"

    iget-object p4, p4, Lb5/V;->f:Lb5/T;

    invoke-virtual {p4, p5}, Lb5/T;->b(Ljava/lang/String;)V

    .line 16
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 17
    :cond_2
    iget-object p5, p1, Lb5/n0;->l:Lb5/P1;

    .line 18
    invoke-static {p5}, Lb5/n0;->d(LD/n;)V

    .line 19
    invoke-virtual {p2, p4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p6

    invoke-virtual {p5, p6, p4}, Lb5/P1;->s0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p5

    if-nez p5, :cond_3

    .line 20
    iget-object p5, p1, Lb5/n0;->i:Lb5/V;

    invoke-static {p5}, Lb5/n0;->f(Lb5/x0;)V

    .line 21
    iget-object p6, p1, Lb5/n0;->m:Lb5/O;

    invoke-virtual {p6, p4}, Lb5/O;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string p6, "Param value can\'t be null"

    .line 22
    iget-object p5, p5, Lb5/V;->i:Lb5/T;

    invoke-virtual {p5, p4, p6}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 24
    :cond_3
    iget-object p6, p1, Lb5/n0;->l:Lb5/P1;

    invoke-static {p6}, Lb5/n0;->d(LD/n;)V

    .line 25
    invoke-virtual {p6, p2, p4, p5}, Lb5/P1;->G0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 26
    :cond_4
    new-instance p1, Lb5/s;

    invoke-direct {p1, p2}, Lb5/s;-><init>(Landroid/os/Bundle;)V

    goto :goto_1

    .line 27
    :cond_5
    new-instance p1, Lb5/s;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p1, p2}, Lb5/s;-><init>(Landroid/os/Bundle;)V

    .line 28
    :goto_1
    iput-object p1, p0, LQ3/j;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb5/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLb5/s;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LQ3/j;->a:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, LF4/y;->e(Ljava/lang/String;)V

    .line 30
    invoke-static {p4}, LF4/y;->e(Ljava/lang/String;)V

    .line 31
    invoke-static {p9}, LF4/y;->h(Ljava/lang/Object;)V

    iput-object p3, p0, LQ3/j;->d:Ljava/lang/Object;

    iput-object p4, p0, LQ3/j;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    .line 32
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, LQ3/j;->f:Ljava/lang/Object;

    iput-wide p5, p0, LQ3/j;->b:J

    iput-wide p7, p0, LQ3/j;->c:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    .line 33
    iget-object p1, p1, Lb5/n0;->i:Lb5/V;

    .line 34
    invoke-static {p1}, Lb5/n0;->f(Lb5/x0;)V

    .line 35
    invoke-static {p3}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object p2

    invoke-static {p4}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    move-result-object p3

    const-string p4, "Event created with reverse previous/current timestamps. appId, name"

    .line 36
    iget-object p1, p1, Lb5/V;->i:Lb5/T;

    invoke-virtual {p1, p2, p3, p4}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iput-object p9, p0, LQ3/j;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(JLR3/m;)LQ3/j;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LQ3/j;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LR3/m;

    .line 6
    .line 7
    invoke-virtual {v1}, LR3/m;->b()LQ3/i;

    .line 8
    .line 9
    .line 10
    move-result-object v9

    .line 11
    move-object v1, v9

    .line 12
    invoke-virtual/range {p3 .. p3}, LR3/m;->b()LQ3/i;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move-object v9, v1

    .line 19
    new-instance v1, LQ3/j;

    .line 20
    .line 21
    iget-wide v7, v0, LQ3/j;->c:J

    .line 22
    .line 23
    iget-object v2, v0, LQ3/j;->f:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, v2

    .line 26
    check-cast v5, LR3/b;

    .line 27
    .line 28
    iget-object v2, v0, LQ3/j;->d:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v2

    .line 31
    check-cast v6, LP3/d;

    .line 32
    .line 33
    move-wide/from16 v2, p1

    .line 34
    .line 35
    move-object/from16 v4, p3

    .line 36
    .line 37
    invoke-direct/range {v1 .. v9}, LQ3/j;-><init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_0
    move-object/from16 v18, v9

    .line 42
    .line 43
    move-object v9, v1

    .line 44
    move-object/from16 v1, v18

    .line 45
    .line 46
    invoke-interface {v9}, LQ3/i;->q()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    move-object v9, v1

    .line 53
    new-instance v1, LQ3/j;

    .line 54
    .line 55
    iget-wide v7, v0, LQ3/j;->c:J

    .line 56
    .line 57
    iget-object v2, v0, LQ3/j;->f:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v5, v2

    .line 60
    check-cast v5, LR3/b;

    .line 61
    .line 62
    iget-object v2, v0, LQ3/j;->d:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v6, v2

    .line 65
    check-cast v6, LP3/d;

    .line 66
    .line 67
    move-wide/from16 v2, p1

    .line 68
    .line 69
    move-object/from16 v4, p3

    .line 70
    .line 71
    invoke-direct/range {v1 .. v9}, LQ3/j;-><init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_1
    move-object v2, v9

    .line 76
    move-object v9, v1

    .line 77
    move-object v1, v2

    .line 78
    move-wide/from16 v2, p1

    .line 79
    .line 80
    invoke-interface {v1, v2, v3}, LQ3/i;->z(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    cmp-long v6, v4, v6

    .line 87
    .line 88
    if-nez v6, :cond_2

    .line 89
    .line 90
    new-instance v1, LQ3/j;

    .line 91
    .line 92
    iget-wide v7, v0, LQ3/j;->c:J

    .line 93
    .line 94
    iget-object v4, v0, LQ3/j;->f:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v5, v4

    .line 97
    check-cast v5, LR3/b;

    .line 98
    .line 99
    iget-object v4, v0, LQ3/j;->d:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v6, v4

    .line 102
    check-cast v6, LP3/d;

    .line 103
    .line 104
    move-object/from16 v4, p3

    .line 105
    .line 106
    invoke-direct/range {v1 .. v9}, LQ3/j;-><init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_2
    invoke-interface {v1}, LQ3/i;->v()J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    invoke-interface {v1, v6, v7}, LQ3/i;->c(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v10

    .line 118
    add-long/2addr v4, v6

    .line 119
    const-wide/16 v12, 0x1

    .line 120
    .line 121
    sub-long v12, v4, v12

    .line 122
    .line 123
    invoke-interface {v1, v12, v13}, LQ3/i;->c(J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v14

    .line 127
    invoke-interface {v1, v12, v13, v2, v3}, LQ3/i;->h(JJ)J

    .line 128
    .line 129
    .line 130
    move-result-wide v12

    .line 131
    add-long/2addr v12, v14

    .line 132
    invoke-interface {v9}, LQ3/i;->v()J

    .line 133
    .line 134
    .line 135
    move-result-wide v14

    .line 136
    move-wide/from16 v16, v4

    .line 137
    .line 138
    invoke-interface {v9, v14, v15}, LQ3/i;->c(J)J

    .line 139
    .line 140
    .line 141
    move-result-wide v4

    .line 142
    cmp-long v8, v12, v4

    .line 143
    .line 144
    iget-wide v12, v0, LQ3/j;->c:J

    .line 145
    .line 146
    if-nez v8, :cond_3

    .line 147
    .line 148
    sub-long v4, v16, v14

    .line 149
    .line 150
    :goto_0
    add-long/2addr v4, v12

    .line 151
    :goto_1
    move-wide v7, v4

    .line 152
    goto :goto_2

    .line 153
    :cond_3
    if-ltz v8, :cond_5

    .line 154
    .line 155
    cmp-long v8, v4, v10

    .line 156
    .line 157
    if-gez v8, :cond_4

    .line 158
    .line 159
    invoke-interface {v9, v10, v11, v2, v3}, LQ3/i;->d(JJ)J

    .line 160
    .line 161
    .line 162
    move-result-wide v4

    .line 163
    sub-long/2addr v4, v6

    .line 164
    sub-long v4, v12, v4

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_4
    invoke-interface {v1, v4, v5, v2, v3}, LQ3/i;->d(JJ)J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    sub-long/2addr v4, v14

    .line 172
    goto :goto_0

    .line 173
    :goto_2
    new-instance v1, LQ3/j;

    .line 174
    .line 175
    iget-object v4, v0, LQ3/j;->f:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v5, v4

    .line 178
    check-cast v5, LR3/b;

    .line 179
    .line 180
    iget-object v4, v0, LQ3/j;->d:Ljava/lang/Object;

    .line 181
    .line 182
    move-object v6, v4

    .line 183
    check-cast v6, LP3/d;

    .line 184
    .line 185
    move-object/from16 v4, p3

    .line 186
    .line 187
    invoke-direct/range {v1 .. v9}, LQ3/j;-><init>(JLR3/m;LR3/b;LP3/d;JLQ3/i;)V

    .line 188
    .line 189
    .line 190
    return-object v1

    .line 191
    :cond_5
    new-instance v1, LN3/b;

    .line 192
    .line 193
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 194
    .line 195
    .line 196
    throw v1
    .line 197
    .line 198
    .line 199
.end method

.method public b(J)J
    .locals 7

    .line 1
    iget-object v0, p0, LQ3/j;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LQ3/i;

    .line 4
    .line 5
    iget-wide v1, p0, LQ3/j;->b:J

    .line 6
    .line 7
    invoke-interface {v0, v1, v2, p1, p2}, LQ3/i;->k(JJ)J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-wide v5, p0, LQ3/j;->c:J

    .line 12
    .line 13
    add-long/2addr v3, v5

    .line 14
    invoke-interface {v0, v1, v2, p1, p2}, LQ3/i;->A(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    add-long/2addr p1, v3

    .line 19
    const-wide/16 v0, 0x1

    .line 20
    .line 21
    sub-long/2addr p1, v0

    .line 22
    return-wide p1
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

.method public c(J)J
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p2}, LQ3/j;->d(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, LQ3/j;->c:J

    .line 6
    .line 7
    sub-long/2addr p1, v2

    .line 8
    iget-wide v2, p0, LQ3/j;->b:J

    .line 9
    .line 10
    iget-object v4, p0, LQ3/j;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, LQ3/i;

    .line 13
    .line 14
    invoke-interface {v4, p1, p2, v2, v3}, LQ3/i;->h(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    add-long/2addr p1, v0

    .line 19
    return-wide p1
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

.method public d(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, LQ3/j;->c:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object v0, p0, LQ3/j;->g:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, LQ3/i;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, LQ3/i;->c(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    return-wide p1
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

.method public e(Lb5/n0;J)LQ3/j;
    .locals 10

    .line 1
    new-instance v0, LQ3/j;

    .line 2
    .line 3
    iget-wide v5, p0, LQ3/j;->b:J

    .line 4
    .line 5
    iget-object v1, p0, LQ3/j;->g:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v9, v1

    .line 8
    check-cast v9, Lb5/s;

    .line 9
    .line 10
    iget-object v1, p0, LQ3/j;->f:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, LQ3/j;->d:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v3, v1

    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, LQ3/j;->e:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v4, v1

    .line 23
    check-cast v4, Ljava/lang/String;

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    move-wide v7, p2

    .line 27
    invoke-direct/range {v0 .. v9}, LQ3/j;-><init>(Lb5/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLb5/s;)V

    .line 28
    .line 29
    .line 30
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LQ3/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LQ3/j;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lb5/s;

    .line 14
    .line 15
    invoke-virtual {v0}, Lb5/s;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Event{appId=\'"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, LQ3/j;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, "\', name=\'"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, LQ3/j;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, "\', params="

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, "}"

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.end method
