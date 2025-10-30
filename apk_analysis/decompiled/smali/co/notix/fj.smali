.class public final Lco/notix/fj;
.super Lco/notix/ap;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/notix/d9;)V
    .locals 1

    const-string v0, "contextProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/notix/ap;-><init>(Lco/notix/d9;)V

    const-class p1, Lco/notix/perseverance/worker/PerseveranceWorker;

    iput-object p1, p0, Lco/notix/fj;->b:Ljava/lang/Class;

    const-string p1, "notix_perseverance"

    iput-object p1, p0, Lco/notix/fj;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/notix/fj;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lco/notix/fj;->b:Ljava/lang/Class;

    return-object v0
.end method
