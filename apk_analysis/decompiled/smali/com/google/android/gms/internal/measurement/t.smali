.class public final Lcom/google/android/gms/internal/measurement/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x6

    .line 3
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x0

    .line 5
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 6
    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->f:Lcom/google/android/gms/internal/measurement/w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->g:Lcom/google/android/gms/internal/measurement/w;

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->h:Lcom/google/android/gms/internal/measurement/w;

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->i:Lcom/google/android/gms/internal/measurement/w;

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->j:Lcom/google/android/gms/internal/measurement/w;

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->k:Lcom/google/android/gms/internal/measurement/w;

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->l:Lcom/google/android/gms/internal/measurement/w;

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/t;->c(Lcom/google/android/gms/internal/measurement/s;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x1

    .line 14
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 15
    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->w:Lcom/google/android/gms/internal/measurement/w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->h0:Lcom/google/android/gms/internal/measurement/w;

    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->i0:Lcom/google/android/gms/internal/measurement/w;

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->j0:Lcom/google/android/gms/internal/measurement/w;

    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->k0:Lcom/google/android/gms/internal/measurement/w;

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->m0:Lcom/google/android/gms/internal/measurement/w;

    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->n0:Lcom/google/android/gms/internal/measurement/w;

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->s0:Lcom/google/android/gms/internal/measurement/w;

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/t;->c(Lcom/google/android/gms/internal/measurement/s;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x2

    .line 24
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 25
    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->d:Lcom/google/android/gms/internal/measurement/w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->m:Lcom/google/android/gms/internal/measurement/w;

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->n:Lcom/google/android/gms/internal/measurement/w;

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->o:Lcom/google/android/gms/internal/measurement/w;

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->t:Lcom/google/android/gms/internal/measurement/w;

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->q:Lcom/google/android/gms/internal/measurement/w;

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->u:Lcom/google/android/gms/internal/measurement/w;

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->y:Lcom/google/android/gms/internal/measurement/w;

    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->l0:Lcom/google/android/gms/internal/measurement/w;

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->x0:Lcom/google/android/gms/internal/measurement/w;

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->A0:Lcom/google/android/gms/internal/measurement/w;

    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->D0:Lcom/google/android/gms/internal/measurement/w;

    .line 36
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->E0:Lcom/google/android/gms/internal/measurement/w;

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/t;->c(Lcom/google/android/gms/internal/measurement/s;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x3

    .line 39
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 40
    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->c:Lcom/google/android/gms/internal/measurement/w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->r0:Lcom/google/android/gms/internal/measurement/w;

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->u0:Lcom/google/android/gms/internal/measurement/w;

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/t;->c(Lcom/google/android/gms/internal/measurement/s;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x4

    .line 44
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 45
    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->z:Lcom/google/android/gms/internal/measurement/w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->A:Lcom/google/android/gms/internal/measurement/w;

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->B:Lcom/google/android/gms/internal/measurement/w;

    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->C:Lcom/google/android/gms/internal/measurement/w;

    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->D:Lcom/google/android/gms/internal/measurement/w;

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->X:Lcom/google/android/gms/internal/measurement/w;

    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->Y:Lcom/google/android/gms/internal/measurement/w;

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->I0:Lcom/google/android/gms/internal/measurement/w;

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/t;->c(Lcom/google/android/gms/internal/measurement/s;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x5

    .line 54
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 55
    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->v:Lcom/google/android/gms/internal/measurement/w;

    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->o0:Lcom/google/android/gms/internal/measurement/w;

    .line 57
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->p0:Lcom/google/android/gms/internal/measurement/w;

    .line 58
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->q0:Lcom/google/android/gms/internal/measurement/w;

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->v0:Lcom/google/android/gms/internal/measurement/w;

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->w0:Lcom/google/android/gms/internal/measurement/w;

    .line 61
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->y0:Lcom/google/android/gms/internal/measurement/w;

    .line 62
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->z0:Lcom/google/android/gms/internal/measurement/w;

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->C0:Lcom/google/android/gms/internal/measurement/w;

    .line 64
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/t;->c(Lcom/google/android/gms/internal/measurement/s;)V

    new-instance p1, Lcom/google/android/gms/internal/measurement/s;

    const/4 v0, 0x7

    .line 66
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/s;-><init>(I)V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 67
    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->e:Lcom/google/android/gms/internal/measurement/w;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->p:Lcom/google/android/gms/internal/measurement/w;

    .line 68
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->r:Lcom/google/android/gms/internal/measurement/w;

    .line 69
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->s:Lcom/google/android/gms/internal/measurement/w;

    .line 70
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->x:Lcom/google/android/gms/internal/measurement/w;

    .line 71
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->Z:Lcom/google/android/gms/internal/measurement/w;

    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->f0:Lcom/google/android/gms/internal/measurement/w;

    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->g0:Lcom/google/android/gms/internal/measurement/w;

    .line 74
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->t0:Lcom/google/android/gms/internal/measurement/w;

    .line 75
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->B0:Lcom/google/android/gms/internal/measurement/w;

    .line 76
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->F0:Lcom/google/android/gms/internal/measurement/w;

    .line 77
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->G0:Lcom/google/android/gms/internal/measurement/w;

    .line 78
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/measurement/w;->H0:Lcom/google/android/gms/internal/measurement/w;

    .line 79
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/t;->c(Lcom/google/android/gms/internal/measurement/s;)V

    return-void

    .line 81
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/TreeMap;

    .line 82
    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/C1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;
    .locals 3

    .line 1
    invoke-static {p1}, Ls8/n;->W(Lcom/google/firebase/messaging/s;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/o;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p2, Lcom/google/android/gms/internal/measurement/o;

    .line 9
    .line 10
    iget-object v0, p2, Lcom/google/android/gms/internal/measurement/o;->b:Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/HashMap;

    .line 15
    .line 16
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/o;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/google/android/gms/internal/measurement/s;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/google/android/gms/internal/measurement/s;

    .line 34
    .line 35
    :goto_0
    invoke-virtual {v1, p2, p1, v0}, Lcom/google/android/gms/internal/measurement/s;->a(Ljava/lang/String;Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    return-object p2
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

.method public b()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/measurement/C1;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/C1;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v2, Lcom/google/android/gms/internal/measurement/s1;->a:LE6/e;

    .line 21
    .line 22
    if-eqz v0, :cond_b

    .line 23
    .line 24
    monitor-enter v2

    .line 25
    :try_start_0
    iget-object v3, v2, LE6/e;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Ljava/util/HashMap;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    iget-object v3, v2, LE6/e;->a:Ljava/io/Serializable;

    .line 34
    .line 35
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/util/HashMap;

    .line 41
    .line 42
    const/16 v5, 0x10

    .line 43
    .line 44
    const/high16 v6, 0x3f800000    # 1.0f

    .line 45
    .line 46
    invoke-direct {v3, v5, v6}, Ljava/util/HashMap;-><init>(IF)V

    .line 47
    .line 48
    .line 49
    iput-object v3, v2, LE6/e;->b:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance v3, Ljava/lang/Object;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v3, v2, LE6/e;->g:Ljava/lang/Object;

    .line 57
    .line 58
    sget-object v3, Lcom/google/android/gms/internal/measurement/t1;->a:Landroid/net/Uri;

    .line 59
    .line 60
    new-instance v5, Lcom/google/android/gms/internal/measurement/v1;

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    invoke-direct {v5, v6, v2}, Lcom/google/android/gms/internal/measurement/v1;-><init>(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v3, v4, v5}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_9

    .line 72
    .line 73
    :cond_0
    iget-object v3, v2, LE6/e;->a:Ljava/io/Serializable;

    .line 74
    .line 75
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    iget-object v3, v2, LE6/e;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 88
    .line 89
    .line 90
    iget-object v3, v2, LE6/e;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 95
    .line 96
    .line 97
    iget-object v3, v2, LE6/e;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Ljava/util/HashMap;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 102
    .line 103
    .line 104
    iget-object v3, v2, LE6/e;->e:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 109
    .line 110
    .line 111
    iget-object v3, v2, LE6/e;->f:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v3, Ljava/util/HashMap;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 116
    .line 117
    .line 118
    new-instance v3, Ljava/lang/Object;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v3, v2, LE6/e;->g:Ljava/lang/Object;

    .line 124
    .line 125
    :cond_1
    :goto_0
    iget-object v3, v2, LE6/e;->g:Ljava/lang/Object;

    .line 126
    .line 127
    iget-object v5, v2, LE6/e;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v5, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    const/4 v6, 0x0

    .line 136
    if-eqz v5, :cond_3

    .line 137
    .line 138
    iget-object v0, v2, LE6/e;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    if-nez v0, :cond_2

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    move-object v6, v0

    .line 152
    :goto_1
    monitor-exit v2

    .line 153
    return-object v6

    .line 154
    :cond_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    :try_start_1
    sget-object v8, Lcom/google/android/gms/internal/measurement/t1;->a:Landroid/net/Uri;

    .line 156
    .line 157
    invoke-virtual {v0, v8}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    .line 158
    .line 159
    .line 160
    move-result-object v7
    :try_end_1
    .catch Lcom/google/android/gms/internal/measurement/w1; {:try_start_1 .. :try_end_1} :catch_1

    .line 161
    if-eqz v7, :cond_9

    .line 162
    .line 163
    :try_start_2
    filled-new-array {v1}, [Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    const/4 v9, 0x0

    .line 168
    const/4 v10, 0x0

    .line 169
    const/4 v12, 0x0

    .line 170
    invoke-virtual/range {v7 .. v12}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 171
    .line 172
    .line 173
    move-result-object v5
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 174
    if-eqz v5, :cond_7

    .line 175
    .line 176
    :try_start_3
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_4

    .line 181
    .line 182
    invoke-interface {v5, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 186
    :try_start_4
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 187
    .line 188
    .line 189
    :try_start_5
    invoke-virtual {v7}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_5
    .catch Lcom/google/android/gms/internal/measurement/w1; {:try_start_5 .. :try_end_5} :catch_1

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :catchall_1
    move-exception v0

    .line 194
    goto :goto_8

    .line 195
    :catch_0
    move-exception v0

    .line 196
    goto :goto_7

    .line 197
    :catchall_2
    move-exception v0

    .line 198
    move-object v1, v0

    .line 199
    goto :goto_5

    .line 200
    :cond_4
    :try_start_6
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 201
    .line 202
    .line 203
    :try_start_7
    invoke-virtual {v7}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_7
    .catch Lcom/google/android/gms/internal/measurement/w1; {:try_start_7 .. :try_end_7} :catch_1

    .line 204
    .line 205
    .line 206
    move-object v0, v6

    .line 207
    :goto_2
    if-eqz v0, :cond_5

    .line 208
    .line 209
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-eqz v4, :cond_5

    .line 214
    .line 215
    move-object v0, v6

    .line 216
    :cond_5
    monitor-enter v2

    .line 217
    :try_start_8
    iget-object v4, v2, LE6/e;->g:Ljava/lang/Object;

    .line 218
    .line 219
    if-ne v3, v4, :cond_6

    .line 220
    .line 221
    iget-object v3, v2, LE6/e;->b:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v3, Ljava/util/HashMap;

    .line 224
    .line 225
    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :catchall_3
    move-exception v0

    .line 230
    goto :goto_4

    .line 231
    :cond_6
    :goto_3
    monitor-exit v2

    .line 232
    if-eqz v0, :cond_a

    .line 233
    .line 234
    return-object v0

    .line 235
    :goto_4
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 236
    throw v0

    .line 237
    :cond_7
    :try_start_9
    new-instance v0, Lcom/google/android/gms/internal/measurement/w1;

    .line 238
    .line 239
    const-string v1, "ContentProvider query returned null cursor"

    .line 240
    .line 241
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 245
    :goto_5
    if-eqz v5, :cond_8

    .line 246
    .line 247
    :try_start_a
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :catchall_4
    move-exception v0

    .line 252
    :try_start_b
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    :cond_8
    :goto_6
    throw v1
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 256
    :goto_7
    :try_start_c
    new-instance v1, Lcom/google/android/gms/internal/measurement/w1;

    .line 257
    .line 258
    const-string v2, "ContentProvider query failed"

    .line 259
    .line 260
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 264
    :goto_8
    :try_start_d
    invoke-virtual {v7}, Landroid/content/ContentProviderClient;->release()Z

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_9
    new-instance v0, Lcom/google/android/gms/internal/measurement/w1;

    .line 269
    .line 270
    const-string v1, "Unable to acquire ContentProviderClient"

    .line 271
    .line 272
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0
    :try_end_d
    .catch Lcom/google/android/gms/internal/measurement/w1; {:try_start_d .. :try_end_d} :catch_1

    .line 276
    :catch_1
    :cond_a
    return-object v6

    .line 277
    :goto_9
    :try_start_e
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 278
    throw v0

    .line 279
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 283
    .line 284
    const-string v1, "ContentResolver needed with GservicesDelegateSupplier.init()"

    .line 285
    .line 286
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    throw v0
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public c(Lcom/google/android/gms/internal/measurement/s;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    check-cast v3, Lcom/google/android/gms/internal/measurement/w;

    .line 17
    .line 18
    iget v3, v3, Lcom/google/android/gms/internal/measurement/w;->a:I

    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v4, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
    .line 37
    .line 38
.end method

.method public d(Lcom/google/firebase/messaging/s;Lb5/G1;)V
    .locals 9

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/S1;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/measurement/S1;-><init>(Lb5/G1;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/t;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/TreeMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Integer;

    .line 29
    .line 30
    iget-object v4, p2, Lb5/G1;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Lcom/google/android/gms/internal/measurement/b;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/b;->a()Lcom/google/android/gms/internal/measurement/b;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v1, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lcom/google/android/gms/internal/measurement/m;

    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v3, p1, v5}, Lcom/google/android/gms/internal/measurement/m;->a(Lcom/google/firebase/messaging/s;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/n;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    instance-of v5, v3, Lcom/google/android/gms/internal/measurement/g;

    .line 53
    .line 54
    const/4 v6, -0x1

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    check-cast v3, Lcom/google/android/gms/internal/measurement/g;

    .line 58
    .line 59
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/g;->a:Ljava/lang/Double;

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    invoke-static {v7, v8}, Ls8/n;->T(D)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v3, v6

    .line 71
    :goto_1
    const/4 v5, 0x2

    .line 72
    if-eq v3, v5, :cond_2

    .line 73
    .line 74
    if-ne v3, v6, :cond_0

    .line 75
    .line 76
    :cond_2
    iput-object v4, p2, Lb5/G1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/t;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, Ljava/util/TreeMap;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p2, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lcom/google/android/gms/internal/measurement/m;

    .line 108
    .line 109
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v2, p1, v3}, Lcom/google/android/gms/internal/measurement/m;->a(Lcom/google/firebase/messaging/s;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/n;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/g;

    .line 118
    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    check-cast v2, Lcom/google/android/gms/internal/measurement/g;

    .line 122
    .line 123
    iget-object v2, v2, Lcom/google/android/gms/internal/measurement/g;->a:Ljava/lang/Double;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    invoke-static {v2, v3}, Ls8/n;->T(D)I

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_5
    return-void
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
