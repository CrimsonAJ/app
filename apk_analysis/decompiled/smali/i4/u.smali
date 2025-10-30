.class public Li4/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:LP5/S;

.field public m:I

.field public n:LP5/S;

.field public o:I

.field public p:I

.field public q:I

.field public r:LP5/S;

.field public s:LP5/S;

.field public t:I

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Ljava/util/HashMap;

.field public z:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7fffffff

    .line 5
    .line 6
    .line 7
    iput v0, p0, Li4/u;->a:I

    .line 8
    .line 9
    iput v0, p0, Li4/u;->b:I

    .line 10
    .line 11
    iput v0, p0, Li4/u;->c:I

    .line 12
    .line 13
    iput v0, p0, Li4/u;->d:I

    .line 14
    .line 15
    iput v0, p0, Li4/u;->i:I

    .line 16
    .line 17
    iput v0, p0, Li4/u;->j:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, Li4/u;->k:Z

    .line 21
    .line 22
    sget-object v1, LP5/F;->b:LP5/D;

    .line 23
    .line 24
    sget-object v1, LP5/S;->e:LP5/S;

    .line 25
    .line 26
    iput-object v1, p0, Li4/u;->l:LP5/S;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput v2, p0, Li4/u;->m:I

    .line 30
    .line 31
    iput-object v1, p0, Li4/u;->n:LP5/S;

    .line 32
    .line 33
    iput v2, p0, Li4/u;->o:I

    .line 34
    .line 35
    iput v0, p0, Li4/u;->p:I

    .line 36
    .line 37
    iput v0, p0, Li4/u;->q:I

    .line 38
    .line 39
    iput-object v1, p0, Li4/u;->r:LP5/S;

    .line 40
    .line 41
    iput-object v1, p0, Li4/u;->s:LP5/S;

    .line 42
    .line 43
    iput v2, p0, Li4/u;->t:I

    .line 44
    .line 45
    iput v2, p0, Li4/u;->u:I

    .line 46
    .line 47
    iput-boolean v2, p0, Li4/u;->v:Z

    .line 48
    .line 49
    iput-boolean v2, p0, Li4/u;->w:Z

    .line 50
    .line 51
    iput-boolean v2, p0, Li4/u;->x:Z

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Li4/u;->y:Ljava/util/HashMap;

    .line 59
    .line 60
    new-instance v0, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Li4/u;->z:Ljava/util/HashSet;

    .line 66
    .line 67
    return-void
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


# virtual methods
.method public a()Li4/v;
    .locals 1

    .line 1
    new-instance v0, Li4/v;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li4/v;-><init>(Li4/u;)V

    .line 4
    .line 5
    .line 6
    return-object v0
    .line 7
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
.end method

.method public b(I)Li4/u;
    .locals 2

    .line 1
    iget-object v0, p0, Li4/u;->y:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Li4/t;

    .line 22
    .line 23
    iget-object v1, v1, Li4/t;->a:LN3/m0;

    .line 24
    .line 25
    iget v1, v1, LN3/m0;->c:I

    .line 26
    .line 27
    if-ne v1, p1, :cond_0

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object p0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final c(Li4/v;)V
    .locals 2

    .line 1
    iget v0, p1, Li4/v;->a:I

    .line 2
    .line 3
    iput v0, p0, Li4/u;->a:I

    .line 4
    .line 5
    iget v0, p1, Li4/v;->b:I

    .line 6
    .line 7
    iput v0, p0, Li4/u;->b:I

    .line 8
    .line 9
    iget v0, p1, Li4/v;->c:I

    .line 10
    .line 11
    iput v0, p0, Li4/u;->c:I

    .line 12
    .line 13
    iget v0, p1, Li4/v;->d:I

    .line 14
    .line 15
    iput v0, p0, Li4/u;->d:I

    .line 16
    .line 17
    iget v0, p1, Li4/v;->e:I

    .line 18
    .line 19
    iput v0, p0, Li4/u;->e:I

    .line 20
    .line 21
    iget v0, p1, Li4/v;->f:I

    .line 22
    .line 23
    iput v0, p0, Li4/u;->f:I

    .line 24
    .line 25
    iget v0, p1, Li4/v;->g:I

    .line 26
    .line 27
    iput v0, p0, Li4/u;->g:I

    .line 28
    .line 29
    iget v0, p1, Li4/v;->h:I

    .line 30
    .line 31
    iput v0, p0, Li4/u;->h:I

    .line 32
    .line 33
    iget v0, p1, Li4/v;->i:I

    .line 34
    .line 35
    iput v0, p0, Li4/u;->i:I

    .line 36
    .line 37
    iget v0, p1, Li4/v;->j:I

    .line 38
    .line 39
    iput v0, p0, Li4/u;->j:I

    .line 40
    .line 41
    iget-boolean v0, p1, Li4/v;->k:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Li4/u;->k:Z

    .line 44
    .line 45
    iget-object v0, p1, Li4/v;->l:LP5/S;

    .line 46
    .line 47
    iput-object v0, p0, Li4/u;->l:LP5/S;

    .line 48
    .line 49
    iget v0, p1, Li4/v;->m:I

    .line 50
    .line 51
    iput v0, p0, Li4/u;->m:I

    .line 52
    .line 53
    iget-object v0, p1, Li4/v;->n:LP5/S;

    .line 54
    .line 55
    iput-object v0, p0, Li4/u;->n:LP5/S;

    .line 56
    .line 57
    iget v0, p1, Li4/v;->o:I

    .line 58
    .line 59
    iput v0, p0, Li4/u;->o:I

    .line 60
    .line 61
    iget v0, p1, Li4/v;->p:I

    .line 62
    .line 63
    iput v0, p0, Li4/u;->p:I

    .line 64
    .line 65
    iget v0, p1, Li4/v;->q:I

    .line 66
    .line 67
    iput v0, p0, Li4/u;->q:I

    .line 68
    .line 69
    iget-object v0, p1, Li4/v;->r:LP5/S;

    .line 70
    .line 71
    iput-object v0, p0, Li4/u;->r:LP5/S;

    .line 72
    .line 73
    iget-object v0, p1, Li4/v;->s:LP5/S;

    .line 74
    .line 75
    iput-object v0, p0, Li4/u;->s:LP5/S;

    .line 76
    .line 77
    iget v0, p1, Li4/v;->t:I

    .line 78
    .line 79
    iput v0, p0, Li4/u;->t:I

    .line 80
    .line 81
    iget v0, p1, Li4/v;->u:I

    .line 82
    .line 83
    iput v0, p0, Li4/u;->u:I

    .line 84
    .line 85
    iget-boolean v0, p1, Li4/v;->v:Z

    .line 86
    .line 87
    iput-boolean v0, p0, Li4/u;->v:Z

    .line 88
    .line 89
    iget-boolean v0, p1, Li4/v;->w:Z

    .line 90
    .line 91
    iput-boolean v0, p0, Li4/u;->w:Z

    .line 92
    .line 93
    iget-boolean v0, p1, Li4/v;->x:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Li4/u;->x:Z

    .line 96
    .line 97
    new-instance v0, Ljava/util/HashSet;

    .line 98
    .line 99
    iget-object v1, p1, Li4/v;->z:LP5/I;

    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Li4/u;->z:Ljava/util/HashSet;

    .line 105
    .line 106
    new-instance v0, Ljava/util/HashMap;

    .line 107
    .line 108
    iget-object p1, p1, Li4/v;->y:LP5/X;

    .line 109
    .line 110
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Li4/u;->y:Ljava/util/HashMap;

    .line 114
    .line 115
    return-void
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

.method public d()Li4/u;
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    iput v0, p0, Li4/u;->u:I

    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
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
.end method

.method public e(I)Li4/u;
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    iput v0, p0, Li4/u;->a:I

    .line 5
    .line 6
    iput p1, p0, Li4/u;->b:I

    .line 7
    .line 8
    return-object p0
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

.method public f(I)Li4/u;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Li4/u;->e:I

    .line 3
    .line 4
    iput p1, p0, Li4/u;->f:I

    .line 5
    .line 6
    return-object p0
    .line 7
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

.method public g(Li4/t;)Li4/u;
    .locals 2

    .line 1
    iget-object v0, p1, Li4/t;->a:LN3/m0;

    .line 2
    .line 3
    iget v1, v0, LN3/m0;->c:I

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Li4/u;->b(I)Li4/u;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Li4/u;->y:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object p0
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

.method public h(I)Li4/u;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/u;->z:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-object p0
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

.method public i(II)Li4/u;
    .locals 0

    .line 1
    iput p1, p0, Li4/u;->i:I

    .line 2
    .line 3
    iput p2, p0, Li4/u;->j:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Li4/u;->k:Z

    .line 7
    .line 8
    return-object p0
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
