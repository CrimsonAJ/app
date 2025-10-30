.class public final Lco/notix/gm;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:Lco/notix/ll;

.field public final synthetic b:J


# direct methods
.method public constructor <init>(Lco/notix/ll;J)V
    .locals 0

    iput-object p1, p0, Lco/notix/gm;->a:Lco/notix/ll;

    iput-wide p2, p0, Lco/notix/gm;->b:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, Lco/notix/gm;->b:J

    .line 6
    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Lco/notix/qo;

    .line 28
    .line 29
    iget-wide v4, v4, Lco/notix/qo;->a:J

    .line 30
    .line 31
    sget-wide v6, Lco/notix/lm;->f:J

    .line 32
    .line 33
    add-long/2addr v4, v6

    .line 34
    cmp-long v4, v4, v0

    .line 35
    .line 36
    if-lez v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object v2, LB7/t;->a:LB7/t;

    .line 43
    .line 44
    :cond_2
    new-instance p1, Lco/notix/qo;

    .line 45
    .line 46
    iget-object v0, p0, Lco/notix/gm;->a:Lco/notix/ll;

    .line 47
    .line 48
    iget-wide v3, v0, Lco/notix/ll;->d:J

    .line 49
    .line 50
    iget-object v0, v0, Lco/notix/ll;->a:Lco/notix/ql;

    .line 51
    .line 52
    invoke-direct {p1, v3, v4, v0}, Lco/notix/qo;-><init>(JLco/notix/ql;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, p1}, LB7/k;->z0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
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
