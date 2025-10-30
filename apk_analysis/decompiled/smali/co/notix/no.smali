.class public final Lco/notix/no;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lco/notix/no;

.field public static final d:Lco/notix/no;

.field public static final e:Lco/notix/no;

.field public static final f:Lco/notix/no;


# instance fields
.field public final a:I

.field public final b:Lco/notix/mo;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/notix/no;

    new-instance v1, Lco/notix/lo;

    invoke-direct {v1}, Lco/notix/lo;-><init>()V

    const/16 v2, 0xf

    invoke-direct {v0, v2, v1}, Lco/notix/no;-><init>(ILco/notix/mo;)V

    sput-object v0, Lco/notix/no;->c:Lco/notix/no;

    new-instance v0, Lco/notix/no;

    new-instance v1, Lco/notix/ko;

    const-wide/16 v2, 0x7d0

    invoke-direct {v1, v2, v3}, Lco/notix/ko;-><init>(J)V

    const/4 v2, 0x5

    invoke-direct {v0, v2, v1}, Lco/notix/no;-><init>(ILco/notix/mo;)V

    sput-object v0, Lco/notix/no;->d:Lco/notix/no;

    new-instance v0, Lco/notix/no;

    new-instance v1, Lco/notix/ko;

    const-wide/16 v2, 0x2710

    invoke-direct {v1, v2, v3}, Lco/notix/ko;-><init>(J)V

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lco/notix/no;-><init>(ILco/notix/mo;)V

    sput-object v0, Lco/notix/no;->e:Lco/notix/no;

    new-instance v0, Lco/notix/no;

    new-instance v1, Lco/notix/jo;

    invoke-direct {v1}, Lco/notix/jo;-><init>()V

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lco/notix/no;-><init>(ILco/notix/mo;)V

    sput-object v0, Lco/notix/no;->f:Lco/notix/no;

    return-void
.end method

.method public constructor <init>(ILco/notix/mo;)V
    .locals 1

    const-string v0, "retryDelay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/notix/no;->a:I

    iput-object p2, p0, Lco/notix/no;->b:Lco/notix/mo;

    return-void
.end method
